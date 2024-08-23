import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class GerenciadorClientes {
	
	//jdbc:oracle:thin:@localhost:port:service
	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
	private Connection conn;
	
	public GerenciadorClientes() throws SQLException {
		
		//DriverManager
		OracleDataSource ods = new OracleDataSource();
		
		//configurando a url
		ods.setURL(url);
		
		//configurando o usuário
		ods.setUser(Credenciais.user);
		
		//configurando a senha
		ods.setPassword(Credenciais.pwd);
		
		//obtendo a conexão
		conn = ods.getConnection();
		System.out.println("Conexão ok!");
	}

	public boolean inserir(Cliente c) {
		String sql = "INSERT INTO TB_CLIENTES VALUES(?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,c.getId());
			ps.setString(2, c.getNome());
			ps.setString(3, c.getSobrenome());
			ps.execute();

        } catch (SQLException e) {
			if (conn == null) {
				System.err.println("Conexão nula!");
			}
            e.printStackTrace();
			return false;
        } finally {

            try {
				System.out.println("Fechando a conexão com o banco de dados");
                conn.close();
            } catch (SQLException e) {
				System.err.println("Erro ao fechar a conexão");
                e.printStackTrace();
            }
        }

        return true;
    }
	
}

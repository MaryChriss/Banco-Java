import java.sql.SQLException;

public class TesteBancoDeDados {
    public static void main(String[] args) throws SQLException {

        //criando um gerenciador de clientes
        GerenciadorClientes gc = new GerenciadorClientes();

        //Cliente cliente = new Cliente(3,"Miguel", "Freitas");

        //System.out.println(gc.inserir(cliente) ?
        //"Cliente adicionado!" : "Cliente NÃO adicionado!");


        System.out.println(gc.excluir(99) ? "Cliente removido" : "Cliente não removido");
    }
}

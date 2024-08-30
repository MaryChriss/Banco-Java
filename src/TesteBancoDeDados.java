import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesteBancoDeDados {
    public static void main(String[] args) throws SQLException {

        //criando um gerenciador de clientes
        GerenciadorClientes gc = new GerenciadorClientes();

        //Criando um cliente
        //Cliente cliente = new Cliente(3,"Miguel", "Freitas");
        //System.out.println(gc.inserir(cliente) ?
        //"Cliente adicionado!" : "Cliente NÃO adicionado!");


        //Delete:
        //System.out.println(gc.excluir(1) ? "Cliente removido" : "Cliente não removido");

        //update:
        //Cliente cliente = new Cliente(3, "Miguel", "Francisco");
        //gc.atualizar(cliente);

        System.out.println("Objeto: " + gc.listar());
    }
}



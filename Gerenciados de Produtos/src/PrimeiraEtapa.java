import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrimeiraEtapa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> produtos = new ArrayList<>();
        int proximoId = 1;
        
        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("\n1. Cadastrar produto");
            System.out.println("2. Listar produto");
            System.out.println("3. Excluir produto");
            System.out.println("4. Alterar produto");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
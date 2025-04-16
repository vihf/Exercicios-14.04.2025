import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SegundaEtapa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Object>> produtos = new ArrayList<>();
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

            switch (opcao) {
                case 1:
                    System.out.println("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.println("Preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    ArrayList<Object> produto = new ArrayList<>();
                    produto.add(proximoId);
                    produto.add(nome);
                    produto.add(preco);

                    produtos.add(produto);
                    System.out.println("Pproduto cadastrado com sucesso!");
                    proximoId++;
                    break;

                case 2:
                    System.out.println("\nLista de produtos");
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (ArrayList<Object> p : produtos) {
                            System.out.println("ID: " + p.get(0) + " | Nome: " + p.get(1) + " | Preço: R$ " + p.get(2));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Id do produto a remover: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();

                    boolean removido = false;
                    for (int i = 0; i < produtos.size(); i++) {
                        if ((int) produtos.get(i).get(0) == idRemover) {
                            produtos.remove(i);
                            removido = true;
                            break;
                        }
                    }
                    if (removido) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto com ID informado não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("ID do produto a alterar: ");
                    int idAlterar = scanner.nextInt();
                    scanner.nextLine();

                    boolean encontrado = false;
                    for (ArrayList<Object> p : produtos) {
                        if ((int) p.get(0) == idAlterar) {
                            System.out.print("Novo nome do produto: ");
                            String novoNome = scanner.nextLine();

                            System.out.print("Novo preço do produto: ");
                            double novoPreco = scanner.nextDouble();
                            scanner.nextLine();

                            p.set(1, novoNome);
                            p.set(2, novoPreco);

                            System.out.println("Produto alterado com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto com ID informado não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Finalizando programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
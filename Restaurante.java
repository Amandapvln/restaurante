import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        int opcao = 0;

        System.out.println("Bem-vindo ao Restaurante XYZ!");

        do {
            System.out.println("O que você gostaria de fazer?");
            System.out.println("1 - Fazer um pedido");
            System.out.println("2 - Verificar o pedido atual");
            System.out.println("3 - Fechar o pedido e sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do prato:");
                    String nome = input.next();
                    System.out.println("Digite o preço do prato:");
                    double preco = input.nextDouble();
                    Pedido pedido = new Pedido(nome, preco);
                    pedidos.add(pedido);
                    break;
                case 2:
                    if (pedidos.size() == 0) {
                        System.out.println("Nenhum pedido foi feito ainda.");
                    } else {
                        System.out.println("Seu pedido atual é:");
                        for (Pedido p : pedidos) {
                            System.out.println("- " + p.getNome() + " (R$" + p.getPreco() + ")");
                        }
                    }
                    break;
                case 3:
                    double total = 0;
                    System.out.println("Seu pedido final é:");
                    for (Pedido p : pedidos) {
                        System.out.println("- " + p.getNome() + " (R$" + p.getPreco() + ")");
                        total += p.getPreco();
                    }
                    System.out.println("Total: R$" + total);
                    System.out.println("Obrigado por escolher o Restaurante XYZ!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        input.close();
    }
}

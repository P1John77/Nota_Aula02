import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Produto ---");
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Tamanho/Peso: ");
        String tamanhoPeso = scanner.nextLine();

        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        System.out.print("Valor: ");
        double valor = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();
        scanner.nextLine();

        Produto produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);

        while (true) {
            System.out.println("\n--- Nova Venda ---");
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Forma de pagamento (Pix/Espécie/Transferência/Débito/Crédito): ");
            String formaPagamento = scanner.nextLine();

            double valorPago = 0;
            if (formaPagamento.equalsIgnoreCase("Espécie")) {
                System.out.print("Valor pago: ");
                valorPago = scanner.nextDouble();
                scanner.nextLine();
            }

            new Venda(produto, quantidade, formaPagamento, valorPago).realizarVenda();

            System.out.print("Deseja realizar outra venda? (s/n): ");
            if (!scanner.nextLine().equalsIgnoreCase("s")) break;
        }

        System.out.println("\n--- Estoque Atual ---\nQuantidade: " + produto.getQuantidadeEstoque());
        scanner.close();
    }
}
public class Venda {
    private Produto produto;
    private int quantidade;
    private String formaPagamento;
    private double valorPago;

    public Venda(Produto produto, int quantidade, String formaPagamento, double valorPago) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.formaPagamento = formaPagamento;
        this.valorPago = valorPago;
    }

    public void realizarVenda() {
        if (produto.vender(quantidade)) {
            double valorTotal = produto.getValor() * quantidade;
            double valorFinal = formaPagamento.equalsIgnoreCase("Crédito") ? valorTotal : valorTotal * 0.95;

            System.out.println("Venda realizada com sucesso!\nValor total: R$" + valorTotal + "\nValor final: R$" + valorFinal);

            if (formaPagamento.equalsIgnoreCase("Espécie") && valorPago > valorFinal) {
                System.out.println("Troco: R$" + (valorPago - valorFinal));
            }
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}
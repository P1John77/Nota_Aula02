public class Produto {
    private int codigo, quantidadeEstoque;
    private String nome, tamanhoPeso, cor;
    private double valor;

    public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean vender(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }

    public double getValor() { return valor; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
}
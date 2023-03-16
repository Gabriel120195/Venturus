package Aula15.Atividade01;

public class Produto {
    public String nome;
    protected double preco;
    protected int quantidade;

    public void status(){
        System.out.println("Produtos: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
    public void totalValorEmEstoque() {
        double t = preco * quantidade;
        double valorEstoque = t;
        System.out.println("Valor em estoque: " + valorEstoque);
    }
    public void addProduto() {
        quantidade++;
    }
    public void removeProduto() {
        quantidade --;
    }
}

package Aula16.Atividade04;

public class Produtos {
    protected int codigo;
    protected String produto;
    protected double preco;

    public Produtos() {
        this.codigo = codigo;
        this.produto = produto;
        this.preco = preco;
    }
    public void realizarCompra(int c,int q){
        this.codigo = c;
        if (codigo == 1) {
            this.preco = 7.00;
        }
        if (codigo == 2) {
            this.preco = 9.00;
        }
        if (codigo == 3) {
            this.preco = 11.00;
        }
        if (codigo == 4) {
            this.preco = 5.00;
        }
        if (codigo == 5) {
            this.preco = 4.00;
        }
        double valorTotal = this.preco * q;
        System.out.println("Total = R$ " + valorTotal);
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}

package Aula15.Atividade01;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Bolacha";
        produto1.quantidade = 50;
        produto1.preco = 2.50;
        produto1.status();
        produto1.totalValorEmEstoque();
        System.out.println(" ");

        Produto produto2 = new Produto();
        produto2.nome = "Margarina";
        produto2.quantidade = 13;
        produto2.preco = 10.00;
        produto2.status();
        produto2.totalValorEmEstoque();
        System.out.println(" ");

        produto1.addProduto();
        produto1.status();
        produto1.totalValorEmEstoque();
        System.out.println(" ");

        produto2.removeProduto();
        produto2.status();
        produto2.totalValorEmEstoque();
    }
}

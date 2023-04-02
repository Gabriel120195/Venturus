package Aula22.Atividade02;


public class ProdutoUsado extends Produto{
    private String dataFabricacao;

    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;

    }

    @Override
    public void etiquetaPreco() {
        System.out.println("Nome do Produto = " + getNome() + " (Usado) / Valor R$ " + getPreco() + " / Data de Fabricação: " + dataFabricacao);
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}

package Aula22.Atividade02;


public class ProdutoImportado extends Produto{
    private double taxaAlfandega;


    public ProdutoImportado(String nome, double preco,double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }
    public double precoTotal(){
        return getPreco() + getTaxaAlfandega();
    }

    @Override
    public void etiquetaPreco() {
        System.out.println("Nome do Produto: " + getNome() + " / Valor R$ " +  getPreco() + " / (Taxa Alfandega R$ " +  taxaAlfandega + ") / Valor Total: R$" + precoTotal());
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }
    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
}

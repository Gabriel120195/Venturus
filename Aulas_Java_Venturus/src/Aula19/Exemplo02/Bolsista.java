package Aula19.Exemplo02;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovar bolsa de = " + this.getNome());
    }

    @Override
    public final void pagarMensalidade(){
        System.out.println(this.getNome() + " É bolsista, tem pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}

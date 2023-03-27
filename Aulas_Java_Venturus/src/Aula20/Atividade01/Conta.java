package Aula20.Atividade01;

public class Conta {
    private int numeroConta;
    private String proprietario;
    private double balanco;

    public Conta(int numeroConta, String proprietario) {
        this.numeroConta = numeroConta;
        this.proprietario = proprietario;
        this.balanco = 0;
    }

    public void deposito(double valDeposito){
        this.balanco = balanco + valDeposito;
        System.out.println("Foi realizado um depósito de R$ " + valDeposito);
        System.out.println("Saldo = R$ " + getBalanco());
    }
    public void saque(double valSaque){
        if (balanco < valSaque) {
            System.out.println("Cuidado Você entrou no cheque especial!");
        }
        this.balanco = balanco - valSaque;
        System.out.println("Foi realizado o saque no valor de R$ " + valSaque);
        System.out.println("Saldo = R$ " + getBalanco());
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public double getBalanco() {
        return balanco;
    }
    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", proprietario='" + proprietario + '\'' + ", balanco=" + balanco + '}';
    }
}

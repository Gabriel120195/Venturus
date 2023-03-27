package Aula18.Atividade01;

public class Conta implements ControleConta{
    private int numeroConta;
    private String proprietario;
    private double balanco;

    public Conta(int numeroConta, String proprietario, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.proprietario = proprietario;
        this.balanco = depositoInicial;
    }
    public Conta(int numeroConta, String proprietario) {
        this.numeroConta = numeroConta;
        this.proprietario = proprietario;
        this.balanco = 0;
    }

    @Override
    public void depositar(double valDeposito) {
        this.balanco = this.balanco + valDeposito;
        System.out.println("Depósito Realizado no valor de R$ " + valDeposito);
        System.out.println("Saldo de sua conta: R$ " + balanco);
    }
    @Override
    public void sacar(double valSaque) {
        this.balanco = (this.balanco - valSaque) - 5;
        System.out.println("Saque Realizado no valor de R$ " + valSaque);
        System.out.println("Uma Taxa de R$ 5,00, foi cobrada!");
        System.out.println("Saldo de sua conta: R$ " + balanco);
    }

    public int getNumeroConta() {
        return numeroConta;
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

    @Override
    public String toString() {
        return "Conta{" + "numeroConta= " + numeroConta + ", proprietario= '" + proprietario + '\'' + ", balanco= " + balanco + '}';
    }
}

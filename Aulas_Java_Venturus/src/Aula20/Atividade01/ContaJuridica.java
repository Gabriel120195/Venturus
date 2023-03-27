package Aula20.Atividade01;

public class ContaJuridica extends Conta{
    private double limiteEmprestimo;

    public ContaJuridica(int numeroConta, String proprietario) {
        super(numeroConta, proprietario);
        this.limiteEmprestimo = 10000;
    }

    public void emprestimo(double valEmprestimo){
        if (valEmprestimo > limiteEmprestimo) {
            System.out.println("Impossível Realizar empréstimo!! Tente um valor menor que R$ " + valEmprestimo);
        }else {
            System.out.println("Empréstimo Realizado!!");
            double taxaImposto = 10.00;
            System.out.println("Foi cobrado um imposto de R$ " + taxaImposto + " Sobre o valor do empréstimo R$ " + valEmprestimo);
            deposito(valEmprestimo - taxaImposto);
        }
    }

    @Override
    public void deposito(double valDeposito) {
        super.deposito(valDeposito);
    }
    @Override
    public void saque(double valSaque) {
        super.saque(valSaque);
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }
    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
}

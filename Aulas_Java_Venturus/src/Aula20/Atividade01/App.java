package Aula20.Atividade01;

public class App {
    public static void main(String[] args) {
        Conta conta = new Conta(001,"Gabriel");
        System.out.println(conta.toString());
        System.out.println("===Depósito===");
        conta.deposito(450.00);
        System.out.println("===Saque===");
        conta.saque(200);
        System.out.println(" ");

        System.out.println("============================================");

        ContaJuridica contaJuridica = new ContaJuridica(002,"Gabriel.S.A");
        System.out.println(contaJuridica.toString());
        System.out.println("==Depósito==");
        contaJuridica.deposito(2500.00);
        System.out.println("==Saque==");
        contaJuridica.saque(500);
        System.out.println(" ");
        System.out.println("==Empréstimo Aceito==");
        contaJuridica.emprestimo(5000);
        System.out.println(" ");
        System.out.println("==Empréstimo Negado==");
        contaJuridica.emprestimo(50000);
    }
}

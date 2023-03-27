package Aula18.Atividade01;

public class ContaTeste {
    public static void main(String[] args) {
        System.out.println("======Com depósito inicial======");
        Conta conta1 = new Conta(01,"Gabriel",1000);
        System.out.println("==Depósito==");
        conta1.depositar(1325.00);
        System.out.println("==Saque==");
        conta1.sacar(750.00);
        System.out.println(conta1.toString());
        System.out.println(" ");

        System.out.println("====SEM depósito incial====");
        Conta conta2 = new Conta(02,"Laura");
        System.out.println("==Depósito==");
        conta2.depositar(2500.00);
        System.out.println("==Saque==");
        conta2.sacar(500.00);
        System.out.println(conta2.toString());
    }
}

package Aula16.Atividade01;


public class ContaBancoTeste {
    public static void main(String[] args) {
        ContaBanco contaBanco1 = new ContaBanco();
        contaBanco1.setNumConta(0001);
        contaBanco1.setTipo("CC");
        contaBanco1.setDono("João Silva");
        contaBanco1.abrirConta();
        contaBanco1.mostrarConta();
        System.out.println("=========");
        contaBanco1.depositar(300.00);
        contaBanco1.mostrarConta();

        System.out.println(" ");
        System.out.println("==========");
        System.out.println(" ");

        ContaBanco contaBanco2 = new ContaBanco();
        contaBanco2.setNumConta(0002);
        contaBanco2.setTipo("CP");
        contaBanco2.setDono("Maria Silva");
        contaBanco2.abrirConta();
        contaBanco2.mostrarConta();
        System.out.println("===========");
        contaBanco2.depositar(400.00);
        contaBanco2.mostrarConta();

    }
}

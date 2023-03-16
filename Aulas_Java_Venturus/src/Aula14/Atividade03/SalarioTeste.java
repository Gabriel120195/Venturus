package Aula14.Atividade03;

public class SalarioTeste {
    public static void main(String[] args) {
        Salario salario1 = new Salario();
        salario1.salario = 2000;
        salario1.CalculaSalario();
        System.out.println(" ");

        System.out.println("\n===================");

        Salario salario2 = new Salario();
        salario2.salario = 3500.00;
        salario2.CalculaSalario();
    }
}

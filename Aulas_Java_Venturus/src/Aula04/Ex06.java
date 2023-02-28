package Aula04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número do funcionário: ");
        int codFuncionario = scan.nextInt();
        System.out.println("Horas trabalhadas: ");
        int hrsTrabalhadas = scan.nextInt();
        System.out.println("Valor que recebe por hora R$: ");
        float valorPorHora = scan.nextFloat();

        float valorAReceber = valorPorHora * hrsTrabalhadas;

        System.out.printf("NÚMERO = " + codFuncionario + "  SALÁRIO = R$ " + "%.2f",valorAReceber);
    }
}

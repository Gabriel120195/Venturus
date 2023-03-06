package Aula08;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int SAL_MIN = 1000;

        float ate_3_salarios = SAL_MIN * 3;
        float ate_6_salarios = SAL_MIN * 6;
        float ate_9_salarios = SAL_MIN * 9;
        float ate_12_salarios = SAL_MIN * 12;
        float ate_15_salarios = SAL_MIN * 15;
        float maiorQue16 = SAL_MIN * 16;

        int porcAumento = 0;
        float salarioAtualizado = 0;

        System.out.println("Nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.println("Salário do funcionário: ");
        int salario = scan.nextInt();

        if (ate_3_salarios >= salario) {
            salarioAtualizado = ((salario * 20) / 100) + salario;
            porcAumento = 20;
        }
        if (ate_6_salarios >= salario) {
            salarioAtualizado = ((salario * 15) / 100) + salario;
            porcAumento = 15;
        }
        if (ate_9_salarios >= salario) {
            salarioAtualizado = ((salario * 12) / 100) + salario;
            porcAumento = 12;
        }
        if (ate_12_salarios >= salario) {
            salarioAtualizado = ((salario * 10) / 100) + salario;
            porcAumento = 10;
        }
        if (ate_15_salarios >= salario) {
            salarioAtualizado = ((salario * 7) / 100) + salario;
            porcAumento = 7;
        }
        if (maiorQue16 < salario) {
            salarioAtualizado = salario;
            porcAumento = 0;
        }
    System.out.println(nome + " Você terá " + porcAumento + "% de aumento!\nHoje seu salário é R$ " + salario + "\nVai receber R$ " + salarioAtualizado);
    }
}

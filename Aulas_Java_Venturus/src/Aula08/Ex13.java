package Aula08;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float imposto = 0;

        System.out.println("Salário da pessoa: R$");
        float salario = scan.nextFloat();

        if (salario > 1903.98) {
            if (salario >= 1903.98 && 2826.65 > salario) {
                imposto = (float) (salario * 7.5) / 100;
            }
            if (salario >= 2826.65 && 3751.05 > salario) {
                imposto = (float) (salario * 15) / 100;
            }
            if (salario >= 3751.05 && 4664.68 > salario) {
                imposto = (float) (salario * 22.5) / 100;
            }
            if (salario >= 4664.68) {
                imposto = (float) (salario * 27.5) / 100;
            }
            System.out.println("Imposto = R$ " + imposto);
        }
        else {
            System.out.println("Isento!");
        }
    }
}

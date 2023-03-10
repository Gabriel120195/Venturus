package Aula10;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float salario = 2000;
        float aumento = 1.5f;

        for (int i = 2010; i <= 2022; i++) {
            System.out.println("\nAno = " + i);
            System.out.printf("Salário R$ " + "%.2f",salario);

            if (i == 2010) {
                salario = (float) (salario * aumento) /100 + salario;
            }
            if (i >= 2011) {
                aumento = aumento + 1.5f;
                salario = (float) (salario * aumento) /100 + salario;
            }
        }
    }
}

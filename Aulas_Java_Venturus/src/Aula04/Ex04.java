package Aula04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor do raio: ");
        float vRaio = scan.nextFloat();

        float area = (float) (3.14 * (vRaio * 2));

        System.out.printf("Área = " + "%.2f",area);
        System.out.printf("\nÁrea = " + "%.4f",area);
    }
}

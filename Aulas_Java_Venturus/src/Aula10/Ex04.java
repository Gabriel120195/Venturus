package Aula10;

import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = 1;
        int y = 1;

        while (x != 0 && y != 0) {

            System.out.println("Valor X: ");
            x = scan.nextInt();
            System.out.println("Valor Y: ");
            y = scan.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Quadrante 1");
            }
            if (x < 0 && y > 0) {
                System.out.println("Quadrante 2");
            }
            if (x < 0 && y < 0) {
                System.out.println("Quadrante 3");
            }
            if (x > 0 && y < 0) {
                System.out.println("Quadrante 4");
            }
            System.out.println("----------");
        }
        System.out.println("Algoritmo Interrompido!!");
    }
}

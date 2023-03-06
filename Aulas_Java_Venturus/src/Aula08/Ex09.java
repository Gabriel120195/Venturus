package Aula08;

import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro número:");
        int numA = scan.nextInt();

        System.out.println("Segundo número:");
        int numB = scan.nextInt();

        if (numA % numB == 0 || numB % numA == 0) {
            System.out.println("São Multiplos");
        }
        else {
            System.out.println("Não são Multiplos");
        }
    }
}

package Aula04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro Número: ");
        int num1 = scan.nextInt();

        System.out.println("Segundo número: ");
        int num2 = scan.nextInt();

        int soma = num1 + num2;

        System.out.println("SOMA = " + soma);
    }
}

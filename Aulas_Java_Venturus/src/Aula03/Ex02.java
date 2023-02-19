package Aula03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro Número: ");
        float n1 = scan.nextFloat();
        System.out.println("Segundo Número: ");
        float n2 = scan.nextFloat();

        float subtracao = n1 - n2;
        float soma = n1 + n2;
        float multi = n1 * n2;
        float divi = n1 / n2;

        System.out.println("SOMA: " + soma);
        System.out.println("SUBTRAÇÃO: " + subtracao);
        System.out.println("MULTIPLICAÇÃO: " + multi);
        System.out.println("DIVISÃO: " + divi);
    }
}

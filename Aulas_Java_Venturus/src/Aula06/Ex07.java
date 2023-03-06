package Aula06;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o Primeiro Valor: ");
        int v1 = scan.nextInt();

        System.out.println("Insira o Segundo Valor: ");
        int v2 = scan.nextInt();

        double operacao = (v1 > v2) ? v1 + v2 : v2 - v1;

        System.out.println(operacao);
    }
}

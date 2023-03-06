package Aula06;

import java.util.Scanner;
public class Ex08_Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor De A:");
        int a = scan.nextInt();
        System.out.println("Valor De B:");
        int b = scan.nextInt();
        System.out.println("Valor De C:");
        int c = scan.nextInt();

        float delta = (b * b) - (4 * c * a);

        float xPositivo = (float) (-b + Math.sqrt (delta)) / (2*a);
        float xNegativo = (float) (-b - Math.sqrt (delta)) / (2*a);

        System.out.println("X + = " + xPositivo);
        System.out.println("X - = " + xNegativo);
    }
}

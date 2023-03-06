package Aula08;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        float a = scan.nextFloat();

        System.out.println("Digite o valor de B: ");
        float b = scan.nextFloat();

        System.out.println("Digite o valor de C: ");
        float c = scan.nextFloat();

        System.out.println("[1] = escrever os três valores A, B e C em ordem crescente;\n" +
                            "[2] = escrever os três valores A, B e C em ordem decrescente;\n" +
                            "[3] = escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois;");
        int i = scan.nextInt();

        switch (i) {
            case 1:
                if (a > b && a > c && b > c) {
                    System.out.println(c + " / " + b + " / " + a);
                }
                if (a > b && a > c && b < c) {
                    System.out.println(b + " / " + c + " / " + a);
                }
                if (b > a && b > c && a > c) {
                    System.out.println(c + " / " + a + " / " + b);
                }
                if (b > a && b > c && a < c) {
                    System.out.println(a + " / " + c + " / " + b);
                }
                if (c > a && c > b && a > b) {
                    System.out.println(b + " / " + a + " / " + c);
                }
                if (c > a && c > b && a < b) {
                    System.out.println(a + " / " + b + " / " + c);
                }
            break;

            case 2:
                if (a > b && a > c && b > c) {
                    System.out.println(a + " / " + b + " / " + c);
                }
                if (a > b && a > c && b < c) {
                    System.out.println(a + " / " + c + " / " + b);
                }
                if (b > a && b > c && a > c) {
                    System.out.println(b + " / " + a + " / " + c);
                }
                if (b > a && b > c && a < c) {
                    System.out.println(b + " / " + c + " / " + a);
                }
                if (c > a && c > b && a > b) {
                    System.out.println(c + " / " + a + " / " + b);
                }
                if (c > a && c > b && a < b) {
                    System.out.println(c + " / " + b + " / " + a);
                }
                break;

            case 3:
                if (a > b && a > c && b > c) {
                    System.out.println(b + " / " + a + " / " + c);
                }
                if (a > b && a > c && b < c) {
                    System.out.println(c + " / " + a + " / " + b);
                }
                if (b > a && b > c && a > c) {
                    System.out.println(a + " / " + b + " / " + c);
                }
                if (b > a && b > c && a < c) {
                    System.out.println(c + " / " + b + " / " + a);
                }
                if (c > a && c > b && a > b) {
                    System.out.println(a + " / " + c + " / " + b);
                }
                if (c > a && c > b && a < b) {
                    System.out.println(b + " / " + c + " / " + a);
                }
                break;

            default:
                System.out.println("Digito inválido!!");
                break;
        }
    }
}

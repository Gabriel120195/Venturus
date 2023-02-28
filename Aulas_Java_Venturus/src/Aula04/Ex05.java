package Aula04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        int a = scan.nextInt();
        System.out.println("Segundo valor: ");
        int b = scan.nextInt();
        System.out.println("Terceiro valor: ");
        int c = scan.nextInt();
        System.out.println("Quarto valor: ");
        int d = scan.nextInt();

        float diferenca = (a * b - c * d);

        System.out.println("Diferença = " + diferenca);
    }
}

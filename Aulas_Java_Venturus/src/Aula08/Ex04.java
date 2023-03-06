package Aula08;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a 1º nota: ");
        int n1 = scan.nextInt();
        System.out.println("Digite a 2º nota: ");
        int n2 = scan.nextInt();
        System.out.println("Digite a 3º nota: ");
        int n3 = scan.nextInt();

        float media = (n1 + n2 + n3) / 3;

        if (media > 7) {
            System.out.println("Aprovado!");
        }
        else if (media <= 7 && media >= 5) {
            System.out.println("Recuperação!");
        }
        else {
            System.out.println("Reprovado!");
        }
        System.out.println("Média = " + media);
    }
}

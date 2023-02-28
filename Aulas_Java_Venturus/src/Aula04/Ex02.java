package Aula04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ano Atual: ");
        int anoAtual = scan.nextInt();

        System.out.println("Ano Nascimento: ");
        int anoNascimento = scan.nextInt();

        System.out.println("Idade = " + (anoAtual - anoNascimento));
    }
}

package Aula03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Aluno: ");
        String nome = scan.nextLine();
        System.out.println("Idade do Aluno: ");
        int idade = scan.nextInt();

        System.out.println("Nota 1º Bimestre: ");
        int n1 = scan.nextInt();
        System.out.println("Nota 2º Bimestre: ");
        int n2 = scan.nextInt();
        System.out.println("Nota 3º Bimestre: ");
        int n3 = scan.nextInt();
        System.out.println("Nota 4º Bimestre: ");
        int n4 = scan.nextInt();

        float media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Nome do aluno = " + nome + "\nSua Idade = " + idade);
        System.out.println("Nota 1º Bimestre = " + n1 + "\nNota 2º Bimestre = " + n2 + "\nNota 3º Bimestre = " + n3 + "\nNota 4º Bimestre = " + n4);
        System.out.println("Média final = " + media);
    }
}

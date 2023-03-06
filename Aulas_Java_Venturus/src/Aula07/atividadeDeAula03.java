package Aula07;

import java.util.Scanner;

public class atividadeDeAula03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String categoria;

        System.out.println("Nome do atleta: ");
        String nome = scan.nextLine();

        System.out.println("Idade do atleta: ");
        int idade = scan.nextInt();

        switch (idade) {
            case 5, 6, 7, 8, 9, 10:
                categoria = "Infatil";
                break;

            case 11,12,13,14,15:
                categoria = "Juvenil";
                break;

            case 16,17,18,19,20:
                categoria = "Junior";
                break;

            case 21,22,23,24,25:
                categoria = "Profissional";
                break;

            default:
                categoria = "Inválido";
                break;
        }
        System.out.println("Nome = " + nome + "\nCategoria = " + categoria);
    }
}

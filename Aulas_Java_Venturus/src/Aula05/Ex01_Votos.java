package Aula05;

import java.util.Scanner;

public class Ex01_Votos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println((idade >= 16) && (idade < 18) || (idade > 70) ? "Voto Facultativo" : "Voto Obrigatório");
    }
}

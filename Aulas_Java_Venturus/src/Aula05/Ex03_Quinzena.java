package Aula05;

import java.util.Scanner;

public class Ex03_Quinzena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dia do Mês: ");
        int dia = scan.nextInt();

        System.out.println((dia > 15) ? "Segunda Quinzena" : "Primeira Quinzena");
    }
}

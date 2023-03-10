package Aula10;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 1;
        int auxiliar = 0;

        System.out.println("Digite o Numero: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= numero ; i++) {
            if (numero % i == 0) {
                auxiliar++;
            }
        }
        if (auxiliar == 2) {
            System.out.println("PRIMO");
        }
        else {
            System.out.println("Não é");
        }
    }
}

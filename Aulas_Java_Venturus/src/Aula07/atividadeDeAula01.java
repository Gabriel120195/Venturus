package Aula07;

import java.util.Scanner;

public class atividadeDeAula01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor sobrando na carteira: R$ ");
        float valor = scan.nextFloat();

        if (valor >= 30.0) {
            System.out.println("Vai ao Cinema!");
        }
        else {
            System.out.println("Fique em casa vendo Tv!");
        }
    }
}

package Aula12;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = scan.nextInt();

        parOuImpar(numero);
    }
    public static void parOuImpar (int n) {

        if (n % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
    }
}

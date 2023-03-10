package Aula10;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int divisores = 0;
        int somaDivisores = 0;

        System.out.println("Digite um numero inteiro: ");
        int numero = scan.nextInt();

        for (int i = 1; i < numero; i++) {
            divisores = numero % i;
            if (divisores == 0){
                System.out.println(i + " Divisor de = " + numero);
                somaDivisores = somaDivisores + i;
            }
        }
        System.out.println("============================");
        System.out.println("Soma dos Divisores = " + somaDivisores);

    }
}

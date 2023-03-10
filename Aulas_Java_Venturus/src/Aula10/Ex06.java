package Aula10;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número Inteiro: ");
        numero = scan.nextInt();

        for (int i = 1; i <= numero ; i++) {
            System.out.println(i + " Linha = " + numero);
        }
        System.out.println("=======================");
        System.out.println("Quadrado do Número = " + Math.pow(numero,2));
        System.out.println("Cubo do Número = " + Math.pow(numero,3));

    }
}

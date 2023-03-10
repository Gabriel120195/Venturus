package Aula12;

import java.util.Random;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random aleatorios = new Random();

        int numero = aleatorios.nextInt(0,100);

        int escolha = 0;

        //System.out.println("Numero = " + numero);

        System.out.println("== O número está entre 0 e 100! ==");

        do{
            System.out.println("Digite o Número: ");
            escolha = scan.nextInt();

            if (numero > escolha) {
                System.out.println("Número verdadeiro é MAIOR!");
            }
            else if (numero < escolha) {
                System.out.println("Número verdadeiro é MENOR!");
            }
            else {
                System.out.println("Número CORRETO!");
            }

        }while (escolha != numero);

        System.out.println("------************------");
        System.out.println("Parabéns!! Digitou o valor Correto!");
    }
}

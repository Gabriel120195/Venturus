package Aula10;

import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a massa inicial: ");
        float massa = scan.nextFloat();

        int tempo = 0;
        float massaInicial = massa;

        while (massa >= 0.5){

        massa = massa /2;
        tempo = tempo + 50;
        }

        float segundos = tempo % 60;
        float minutos = segundos / 60;
        float horas = minutos / 60;

        System.out.println("Massa Inicial = " + massaInicial);
        System.out.printf("Massa Final = " + "%.2f",massa);
        System.out.printf("\nSegundos = " + "%.2f",segundos);
        System.out.printf("\nMinutos = " + "%.2f",minutos);
        System.out.printf("\nHoras = " + "%.2f",horas);
    }
}

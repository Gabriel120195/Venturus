package Aula07;

import java.util.Scanner;

public class atividadeDeAula02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor do Raio: ");
        float raio = scan.nextFloat();

        if (raio > 0) {
            float calculo = (float) (Math.PI * (raio * raio));
            System.out.printf("Área do círculo = " + calculo + " Cm²");
        }
        else {
            System.out.println("Valor do raio foi negativo");
        }
    }
}

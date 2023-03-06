package Aula08;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número");
        int num = scan.nextInt();

        if (num >= 0 && num <= 100) {
            if (num >= 0 && num < 25) {
                System.out.println("Intervalo Entre [0,25]");
            }
            if (num >= 25 && num < 50){
                System.out.println("Intervalo entre [25,50]");
            }
            if (num >= 50 && num < 75) {
                System.out.println("Intervalo entre [50,75]");
            }
            if (num >= 75 && num <= 100) {
                System.out.println("Intervalo entre [75,100]");
            }
        }
        else {
            System.out.println("Fora do Intervalo");
        }
    }
}

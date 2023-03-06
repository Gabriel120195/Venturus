package Aula08;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Altura:");
        float altura = scan.nextFloat();

        System.out.println("Peso:");
        float peso = scan.nextFloat();

        double imc =  peso / (altura * altura);

        if (16 > imc) {
            System.out.println("Magreza Grave!");
        }
        if (imc >= 16 && 17 > imc ) {
            System.out.println("Magreza Moderada!");
        }
        if (imc >= 17 && 18.5 > imc) {
            System.out.println("Magreza Leva!");
        }
        if (imc >= 18.5 && 25 > imc) {
            System.out.println("Saudável!");
        }
        if (imc >= 25 && 30 > imc) {
            System.out.println("Sobrepeso!");
        }
        if (imc >= 30 && 35 > imc) {
            System.out.println("Obesidade Grau 1!");
        }
        if (imc >= 35 && 40 > imc) {
            System.out.println("Obesidade Grau 2 (Severa)!");
        }
        if (imc >= 40) {
            System.out.println("Obesidade Grau 3 (Mórbida)!");
        }
        System.out.println("IMC = " + imc);
    }
}

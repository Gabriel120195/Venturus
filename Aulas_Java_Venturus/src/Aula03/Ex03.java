package Aula03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor da Altura: ");
        float altura = scan.nextFloat();
        System.out.println("Valor da Base: ");
        float base = scan.nextFloat();

        float area = (base * altura) / 2;

        System.out.println("Base = " + base);
        System.out.println("Altura = " + altura);
        System.out.println("Área = " + area + "Cm²");
    }
}

package Aula04;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor de A: ");
        float a = scan.nextFloat();
        System.out.println("Valor de B: ");
        float b = scan.nextFloat();
        System.out.println("Valor de C: ");
        float c = scan.nextFloat();

        float triangulo = a * c / 2.0f;
        float circulo = (float) 3.14 * (c * c);
        float trapezio = ((a + b) * c) / 2;
        float quadrado = b * b;
        float retangulo = a * b;

        System.out.printf("Triângulo = " + "%.3f",triangulo);
        System.out.printf("\nCírculo = " + "%.3f",circulo);
        System.out.printf("\nTrapézio = " + "%.3f",trapezio);
        System.out.printf("\nQuadrado = " + "%.3f",quadrado);
        System.out.printf("\nRetângulo = " + "%.3f",retangulo);
    }
}

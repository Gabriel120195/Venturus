package Aula06;

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor de A: ");
        float a = scan.nextFloat();

        System.out.println("Valor de B: ");
        float b = scan.nextFloat();

        System.out.println("Valor de C: ");
        float c = scan.nextFloat();

        if ((a+b)>c && (a+c)>b && (b+c)>a) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            }
            if (a != b && b != c) {
                System.out.println("Triângulo Escaleno");
            }
            if ((a != b && a == c) || (b != c && b == a) || (a != c && b == c)) {
                System.out.println("Triângulo Isóceles");
            }
        }
        else {
            System.out.println("Não pode formar um Triângulo");
        }
    }
}

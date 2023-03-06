package Aula08;

import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro Valor:");
        float num1 = scan.nextFloat();

        System.out.println("Segundo Valor:");
        float num2 = scan.nextFloat();

        System.out.println("[1] para Soma (+)\n" +
                "[2] para Subtração (-)\n" +
                "[3] para Multiplicação (x)\n" +
                "[4] para Divisão (/)\n" +
                "[5] para cancelar");
        int opcao = scan.nextInt();

        switch (opcao) {

            case 1:
                float soma = num1 + num2;
                System.out.println("Soma = " + soma);
                break;

            case 2:
                float subt = num1 - num2;
                System.out.println("Subtração = " + subt);
                break;

            case 3:
                float multi = num1 * num2;
                System.out.println("Multiplicação = " + multi);
                break;

            case 4:
                float divi = num1 / num2;
                System.out.println("Divisão = " + divi);
                break;

            case 5:
                System.out.println("Operação Cancelada!");
                break;

            default:
                System.out.println("Operação inválida!");
                break;
        }
    }
}

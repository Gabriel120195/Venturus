package Aula04;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Código da peça: ");
        int codDaPeca1 = scan.nextInt();
        System.out.println("Quantidade de peças: ");
        int qtdPecas1 = scan.nextInt();
        System.out.println("Valor unitário da peça R$: ");
        float valorPeca1 = scan.nextFloat();


        System.out.println("Código da segunda peça: ");
        int codDaPeca2 = scan.nextInt();
        System.out.println("Quantidade de peças: ");
        int qtdPecas2 = scan.nextInt();
        System.out.println("Valor unitário da peça R$: ");
        float valorPeca2 = scan.nextFloat();

        float somaPeca1 = qtdPecas1 * valorPeca1;
        float somaPeca2 = qtdPecas2 * valorPeca2;

        System.out.printf("VALOR A PAGAR = R$ " + "%.2f",(somaPeca1 + somaPeca2));
    }
}

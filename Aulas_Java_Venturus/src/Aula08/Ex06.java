package Aula08;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("[1] para doar R$10\n" +
                           "[2] para doar R$25\n" +
                           "[3] para doar R$50\n" +
                           "[4] para doar outros valores\n" +
                           "[5] para cancelar");
        int opcao = scan.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Doação de R$ 10,00");
                break;

            case 2:
                System.out.println("Doação de R$ 25,00");
                break;

            case 3:
                System.out.println("Doação de R$ 50,00");
                break;

            case 4:
                System.out.println("Digite o valor:");
                float outroValor = scan.nextFloat();
                System.out.println("Doação de R$ " + outroValor);
                break;

            case 5:
                System.out.println("Operação cancelada!");
                break;

            default:
                System.out.println("Digito inválido");
                break;
        }
        System.out.println("Obrigado pela contribuição");
    }
}

package Aula10;

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int senha;

        do {
            System.out.println("Digite a senha: ");
            senha = scan.nextInt();

            if (senha != 2023) {
                System.out.println("Senha Inválida!\nTente Novamente!");
            }
            System.out.println("===================");
        } while (senha != 2023);

        System.out.println("Acesso Permitido!");
    }
}

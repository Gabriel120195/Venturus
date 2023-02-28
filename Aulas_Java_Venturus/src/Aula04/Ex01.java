package Aula04;

import java.text.ParseException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Cliente: ");
        String nome = scan.nextLine();

        System.out.println("Agência: ");
        int agencia = scan.nextInt();

        System.out.println("Conta: ");
        int conta = scan.nextInt();

        System.out.println("Nome do cliente = " + nome
                + "\nAgência = " + agencia
                + "\nConta = " + conta);
    }
}

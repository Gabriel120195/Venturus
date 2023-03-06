package Aula08;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Salário do cliente: R$ ");
        float salario = scan.nextFloat();

        System.out.println("Financiamento pretendido: R$ ");
        float financiamento = scan.nextFloat();

        salario *= 5;

        if (salario <= financiamento) {
            System.out.println("Financiamento Negado!!");
        }else {
            System.out.println("Financiamento Concedido!!");
        }

        System.out.println("Obrigado pela consulta!");
    }
}

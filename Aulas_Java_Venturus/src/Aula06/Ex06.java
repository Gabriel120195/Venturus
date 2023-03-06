package Aula06;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int valor = scan.nextInt();

        System.out.println((valor > 10) ? "Valor Maior que 10" : (valor > 5) ? "Valor Maior que 5" : "Valor Menor que 5");
    }
}

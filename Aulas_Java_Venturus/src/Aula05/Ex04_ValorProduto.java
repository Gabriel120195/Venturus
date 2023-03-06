package Aula05;

import java.util.Scanner;

public class Ex04_ValorProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precoFinal;

        System.out.println("Preço do produto: R$ ");
        float preco = scan.nextFloat();

        precoFinal = (preco < 30) ? preco - preco * 0.10 : preco - preco * 0.20;

        System.out.println("Valor do produto com desconto R$ " + precoFinal);
    }
}

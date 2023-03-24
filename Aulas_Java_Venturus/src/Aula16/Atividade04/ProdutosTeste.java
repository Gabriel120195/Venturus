package Aula16.Atividade04;

import java.util.Scanner;

public class ProdutosTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Produtos: \n" +
                "Codigo = 1 / Produto = Hot-Dog / Valor = R$ 7,00\n" +
                "Codigo = 2 / Produto = X-Salada / Valor = R$ 9,00\n" +
                "Codigo = 3 / Produto = X-Bacon / Valor = R$ 11,00\n" +
                "Codigo = 4 / Produto = Torrada / Valor = R$ 5,00\n" +
                "Codigo = 5 / Produto = Refrigerante / Valor = R$ 4,00");
        System.out.println("=====================");
        System.out.println("Codigo do produto: ");
        int c = scan.nextInt();
        System.out.println("Quantidade do produto: ");
        int q = scan.nextInt();

        Produtos cliente = new Produtos();
        cliente.realizarCompra(c,q);
    }
}

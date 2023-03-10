package Aula10;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao = 0;
        int produtoAA = 0;
        int produtoBB = 0;
        int produtoCC = 0;

        do {

            System.out.println("Opções:\n1 - ProdutoAA\n2 - ProdutoBB\n3 - ProdutoCC\n4 - FIM");
            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    produtoAA = produtoAA + 1;
                    break;

                case 2:
                    produtoBB = produtoBB + 1;
                    break;

                case 3:
                    produtoCC = produtoCC + 1;
                    break;
                case 4:
                    break;

            }
        }while (opcao != 4);

        System.out.println("====== MUITO OBRIGADO! ======");
    System.out.println("=============================");
        System.out.println("Quantidade de Produtos AA = " + produtoAA);
        System.out.println("Quantidade de Produtos BB = " + produtoBB);
        System.out.println("Quantidade de Produtos CC = " + produtoCC);
    }
}

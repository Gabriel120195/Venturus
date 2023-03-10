package Aula12;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int matriz [] [] = new int[3] [3];

        int somaMatriz = 0;
        int somaDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("matriz [" + i + "]" + " matriz [" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaMatriz = somaMatriz + matriz[i][j];
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Soma = " + somaMatriz);
        System.out.println("Soma da Linha 3 = " + (matriz[2][0] + matriz[2][1] + matriz[2][2]));
        System.out.println("Soma Coluna 2 = " + (matriz[0][1] + matriz[1][1] + matriz[2][1]));
        System.out.println("Soma Diagonal = " + (matriz[0][0] + matriz[1][1] + matriz[2][2]));
    }
}

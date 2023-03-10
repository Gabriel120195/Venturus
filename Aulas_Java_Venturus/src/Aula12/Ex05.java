package Aula12;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int matriz [] [] = new int[3] [4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("matriz [" + i + "]" + " matriz [" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("=== ORIGINAL ===");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("=== ALTERADA ===");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

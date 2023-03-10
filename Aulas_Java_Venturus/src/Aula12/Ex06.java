package Aula12;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Vetor = [" + i + "]");
            vetor[i] = scan.nextInt();
        }

        Arrays.sort(vetor);

        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

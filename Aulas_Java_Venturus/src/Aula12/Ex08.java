package Aula12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random aleatorios = new Random();

        int numeros[] = new int[6];


        for (int i = 0; i < 6; i++) {
            numeros[i] = aleatorios.nextInt(1,60);
        }

        Arrays.sort(numeros);

        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " / ");
        }
    }
}

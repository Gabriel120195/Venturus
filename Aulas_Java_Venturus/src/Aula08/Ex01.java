package Aula08;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " = PAR");
        }
        else {
            System.out.println(num + " = IMPAR");
        }
    }
}

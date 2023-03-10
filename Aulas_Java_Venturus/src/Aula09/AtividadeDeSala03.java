package Aula09;

import java.util.Scanner;

public class AtividadeDeSala03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int num = scan.nextInt();
        int contador = num;
        int fatorial = 1;

        do {
            contador--;
            fatorial = fatorial * contador;

        }while (contador >= 1);
        System.out.println(fatorial);
    }
}

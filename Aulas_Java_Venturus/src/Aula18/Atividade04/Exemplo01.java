package Aula18.Atividade04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            String[] vect = scan.nextLine().split(" ");
            int posicao = scan.nextInt();

            System.out.println(vect[posicao]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida!");

        } catch (InputMismatchException e){
            System.out.println("Erro de Entrada!");
        }

        System.out.println("Fim do Programa");
        scan.close();
    }
}

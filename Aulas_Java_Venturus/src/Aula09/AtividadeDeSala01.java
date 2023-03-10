package Aula09;

import java.util.Scanner;

public class AtividadeDeSala01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numInicial = scan.nextInt();

        System.out.println("Digite o primeiro número: ");
        int numFinal = scan.nextInt();


        while (numFinal >= numInicial){
            System.out.println("=" + numInicial);
             numInicial++;
        }
        while (numInicial >= numFinal) {
            System.out.println("== " + numInicial);
            numInicial--;
        }

        //if (numFinal > numInicial) {
          //  for (int i = numInicial; i <= numFinal; i++) {
            //    System.out.println("= > " + i);
          //  }
        //}
        //else {
          //  for (int i = numInicial; i >= numFinal ; i--) {
            //    System.out.println("= < " + i);
            //}
        }
    }

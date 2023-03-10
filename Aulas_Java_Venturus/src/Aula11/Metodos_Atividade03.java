package Aula11;

import java.util.Scanner;

public class Metodos_Atividade03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int numA = scan.nextInt();
        System.out.println("Segundo número: ");
        int numB = scan.nextInt();

        soma(numA,numB);
        multi(numA,numB);

        //int c = soma(numA,numB);
        System.out.println(soma(numA,numB));
        System.out.println(multi(numA,numB));
    }
        public static int soma(int a, int b) {
        int s;
            s = a + b;
        return s;
    }

    public  static  int multi(int a, int b) {
        int m;
        m = a * b;
        return m;
    }

    //public  static  int dobro(int a,int b) {
      //  int d;
       // return d;
    }
//}

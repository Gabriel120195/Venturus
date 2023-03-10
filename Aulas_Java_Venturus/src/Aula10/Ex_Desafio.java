package Aula10;

import java.util.Scanner;

public class Ex_Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome01 = null;
        String nome02 = null;
        String nome03 = null;
        String nome04 = null;
        String nome05 = null;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Nome Candidato: ");
            String nome = scan.nextLine();

            if (i == 1){
                nome01 = nome;
            }
            if (i == 2) {
                nome02 = nome;
            }
            if (i == 3) {
                nome03 = nome;
            }
            if (i == 4) {
                nome04 = nome;
            }
            if (i == 5) {
                nome05 = nome;
            }
        }
        System.out.println("Quantidade de alunos: ");
        int votos = scan.nextInt();

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;

        for (int i = 1; i <= votos;) {
            System.out.println("Digite o numero do seu candidato: ");
            System.out.println(nome01 + " = [1]\n" + nome02 + " = [2]\n" + nome03 + " = [3]\n" + nome04 + " = [4]\n" + nome05 + " = [5]");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    i++;
                    n1 = n1 + 1;
                    break;

                case 2:
                    i++;
                    n2 = n2 + 1;
                    break;

                case 3:
                    i++;
                    n3 = n3 + 1;
                    break;

                case 4:
                    i++;
                    n4 = n4 + 1;
                    break;
                case 5:
                    i++;
                    n5 = n5 + 1;
                    break;

                default:
                    System.out.println(" ===== Digito inválido! =====");
                    break;
            }
        }

        System.out.println("Total de Votos = " + (n1 + n2 + n3 + n4 + n5));
        System.out.println("Total de Votos " + nome01 + " = " + n1);
        System.out.println("Total de Votos " + nome02 + " = " + n2);
        System.out.println("Total de Votos " + nome03 + " = " + n3);
        System.out.println("Total de Votos " + nome04 + " = " + n4);
        System.out.println("Total de Votos " + nome05 + " = " + n5);
        System.out.println("=====================================");
        System.out.println("");

        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
            System.out.println("VENCEDOR = " + nome01);
        }
        if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
            System.out.println("VENCEDOR = " + nome02);
        }
        if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
            System.out.println("VENCEDOR = " + nome03);
        }
        if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
            System.out.println("VENCEDOR = " + nome04);
        }
        if (n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4) {
            System.out.println("VENCEDOR = " + nome05);
        }
    }
}

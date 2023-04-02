package Aula20.Atividade02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();


        int opcaoCor;
        int opcao;

        do {
            System.out.println("Qual figura gostaria de saber a area?\n1- Circulo\n2 - Retangulo\n0 - Cancelar");
            opcao = scan.nextInt();

            if (opcao != 0) {
                System.out.println("Qual cor gostaria na figura?\n1 - Preto\n2 - Azul\n3 - Vermelho");
                opcaoCor = scan.nextInt();


                if (opcaoCor == 1) {
                    circulo.setCor(Cor.BLACK);
                    retangulo.setCor(Cor.BLACK);
                }
                if (opcaoCor == 2) {
                    circulo.setCor(Cor.BLUE);
                    retangulo.setCor(Cor.BLUE);
                }
                if (opcaoCor == 3) {
                    circulo.setCor(Cor.RED);
                    retangulo.setCor(Cor.RED);
                }
            }

            switch (opcao){
                case 1:
                    System.out.println("Valor do Raio do circulo: ");
                    double r = scan.nextDouble();
                    circulo.setRaio(r);
                    circulo.area();
                    break;

                case 2:
                    System.out.println("Valor da Base: ");
                    double b = scan.nextDouble();
                    System.out.println("Valor da Altura: ");
                    double a = scan.nextDouble();
                    retangulo.setBase(b);
                    retangulo.setAltura(a);
                    retangulo.area();
                    break;
            }
            System.out.println("===========================");
        }while (opcao != 0);
    }
}


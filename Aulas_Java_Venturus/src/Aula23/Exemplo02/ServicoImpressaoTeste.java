package Aula23.Exemplo02;

import java.util.Scanner;

public class ServicoImpressaoTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ServicoImpressaoInteiro servico1 = new ServicoImpressaoInteiro();
        ServicoImpressaoString servicoString = new ServicoImpressaoString();
        ServicoImpressaoObject servicoObject = new ServicoImpressaoObject();

        System.out.println("Quantidade de valores: ");
        int v = scan.nextInt();

        for (int i = 0; i < v; i++) {
            System.out.println((i + 1) + " Valor: ");
            int valor = scan.nextInt();
            servico1.adicionaValor(valor);
        }

        for (int j = 0; j < v; j++) {
            System.out.println((j + 1) + " Valor String: ");
            String valor = scan.next();
            servicoString.adicionaValor(valor);
        }

        for (int i = 0; i < v; i++) {
            System.out.println((i + 1) + " Valor Object: ");
            int valor = scan.nextInt();
            //pode ser trocado para String
            //String valor = scan.next();
            servicoObject.adicionaValor(valor);
        }

        System.out.println("======Exemplo Integer======");
        servico1.imprime();
        System.out.println("===============");
        System.out.println("Primeiro valor = " + servico1.primeiroValor());
        System.out.println("====================================");

        System.out.println(" ");

        System.out.println("======Exemplo String======");
        servicoString.imprime();
        System.out.println("===============");
        System.out.println("Primeiro valor = " + servicoString.primeiroValor());
        System.out.println("====================================");

        System.out.println(" ");

        System.out.println("======Exemplo Object======");
        servicoObject.imprime();
        System.out.println("===============");
        System.out.println("Primeiro valor = " + servicoObject.primeiroValor());
        System.out.println("====================================");

        scan.close();
    }
}

package Aula22.Atividade02;

import java.util.*;

public class ProdutosTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        int opcao = 0;
        String nome = " ";
        double valor = 0;
        double taxaalfa = 0;
        String dataFabricacao = " ";


        do {
            System.out.println("Tipo do produto: \n1 - Produto\n2 - Produto Importado\n3 - Produto Usado" + "\n0 - Sair");
            opcao = scan.nextInt();

            if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 0) {
                if (opcao == 1) {
                    System.out.println("Nome do Produto: ");
                    nome = scan.next();
                    System.out.println("Valor do Produto: R$ ");
                    valor = scan.nextDouble();

                    produtos.add(new Produto(nome,valor));

                }else if (opcao == 2){
                    System.out.println("Nome do Produto: ");
                    nome = scan.next();
                    System.out.println("Valor do Produto: R$ ");
                    valor = scan.nextDouble();
                    System.out.println("Taxa Alfandega: R$ ");
                    taxaalfa = scan.nextDouble();

                    produtos.add(new ProdutoImportado(nome,valor,taxaalfa));

                }else if (opcao == 3){
                    System.out.println("Nome do Produto: ");
                    nome = scan.next();
                    System.out.println("Valor do Produto: R$ ");
                    valor = scan.nextDouble();
                    System.out.println("Data de Fabricação do Produto: ");
                    dataFabricacao = scan.next();

                    produtos.add(new ProdutoUsado(nome,valor,dataFabricacao));
                }else {
                    if (produtos.size() == 0) {
                        System.out.println("Saindo do programa!");
                    }else {
                        System.out.println("Criando Etiquetas!!");
                    }
                }
            }else {
                System.out.println("Número Inválido!");
            }
            
        }while (!(opcao == 0));

        for (Produto p : produtos) {
            System.out.println("==================================================");
            p.etiquetaPreco();
        }
    }
}

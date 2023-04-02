package Aula23.ExemploMap.Exemplo09;

import java.util.HashMap;
import java.util.Map;

public class ProdutoMapTeste {
    public static void main(String[] args) {
        Map<Produto,Double> estoque = new HashMap<>();

        Produto p1 = new Produto("Tv",900.00);
        Produto p2 = new Produto("Notebook",1200.00);
        Produto p3 = new Produto("Tablet",400.00);

        estoque.put(p1,10000.00);
        estoque.put(p2,20000.00);
        estoque.put(p3,15000.00);

        //Verifica se contém a chave// Necessita utilizar o equal e hashcode
        Produto ps = new Produto("Tv",900.00);
        System.out.println("Contem a chave ps = " + estoque.containsKey(ps));

    }
}

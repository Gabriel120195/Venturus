package Aula23.ExemploSet.Exemplo07;

import java.util.Set;
import java.util.TreeSet;

public class Produtos07Teste {
    public static void main(String[] args) {

        Set<Produto> lista = new TreeSet<>();

        lista.add(new Produto("Tv", 900.00));
        lista.add(new Produto("Notebook", 1200.00));
        lista.add(new Produto("Tablet", 400.00));

        for (Produto p: lista) {
            System.out.println(p);
        }

        Produto prod = new Produto("Tablet",400.00);
        System.out.println(lista.contains(prod));
    }
}

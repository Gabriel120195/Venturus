package Aula23.ExemploSet.Exemplo06;

import java.util.HashSet;
import java.util.Set;

public class ProdutosTeste {
    public static void main(String[] args) {

        Set<Produto> lista = new HashSet<>();

        lista.add(new Produto("Tv",900.00));
        lista.add(new Produto("Notebook", 1200.00));
        lista.add(new Produto("Tablet", 400.00));

        //Criei um novo produto igual a tv, para comparar com a mesma na lista
        //Porem o resultado é falso, nesse caso é necessario o icons / hascode na classe produto
        //Como ja coloquei, o resultado é true!
        Produto prod = new Produto("Tv",900.00);
        System.out.println(lista.contains(prod));

    }
}

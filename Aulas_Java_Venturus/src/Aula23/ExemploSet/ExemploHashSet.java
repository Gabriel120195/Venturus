package Aula23.ExemploSet;

import java.util.*;

public class ExemploHashSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Imprime de forma aleatoria
        Set<String> set = new HashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("NoteBook");

        //Verifica se contem na lista e retorna boolean
        System.out.println(set.contains("Tablet"));

        //Remove o item da lista e retorna boolean
        // System.out.println(set.remove("Tv"));

        //Remove os itens da lista que o comprimento é maior que 3
        // set.removeIf(x -> x.length() >= 3);

        //Remove os itens da lista que comecem com a letra T
        // set.removeIf(x -> x.charAt(0) == 'T');

        for (String p: set) {
            System.out.println(p);
        }



    }
}

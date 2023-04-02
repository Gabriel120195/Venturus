package Aula23.ExemploSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        //Imprime na ordem que foi adicionado
        Set<String> setLinked = new LinkedHashSet<>();

        setLinked.add("Tv");
        setLinked.add("Tablet");
        setLinked.add("NoteBook");

        for (String l: setLinked) {
            System.out.println(l);
        }
    }
}

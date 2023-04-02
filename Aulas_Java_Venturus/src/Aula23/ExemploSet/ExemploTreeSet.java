package Aula23.ExemploSet;

import java.util.Set;
import java.util.TreeSet;
public class ExemploTreeSet {
    public static void main(String[] args) {

        System.out.println("Exemplo com String");
        //Imprime em ordem alfabetica no caso String // se fosse int era ordem crescente
        Set<String> setStringg = new TreeSet<>();

        setStringg.add("Tv");
        setStringg.add("Tablet");
        setStringg.add("NoteBook");

        for (String t: setStringg) {
            System.out.println(t);
        }

        System.out.println("===================");
        System.out.println("Exemplo com Integer");
        Set<Integer> setIntegerr = new TreeSet<>();

        setIntegerr.add(8);
        setIntegerr.add(25);
        setIntegerr.add(10);

        for (Integer a: setIntegerr) {
            System.out.println(a);
        }
    }
}

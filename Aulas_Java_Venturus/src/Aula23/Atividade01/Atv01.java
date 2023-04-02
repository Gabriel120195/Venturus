package Aula23.Atividade01;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Atv01 {
    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //Uniao
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println("===== União =====");
        System.out.println(c);

        //Interseção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println("===== Interseção =====");
        System.out.println(d);

        //Diferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println("===== Diferença =====");
        System.out.println(e);
    }
}

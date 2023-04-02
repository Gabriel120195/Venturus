package Aula23.ExemploList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploDeList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("Laura");
        nomes.add("Sandra");
        nomes.add("Larissa");
        nomes.add("Fabricio");

        //Adiciona valor na posicao que deseja / no caso 1
        nomes.add(1,"Felipe");

        for (String x:nomes) {
            System.out.println("Nomes = " + x);
        }

        //Tamanho da lista
        System.out.println("Tamanho lista = " + nomes.size());

        System.out.println("===========================");

        //Remover valores da lista com "filtro", no caso que tenha letra M na posicao 0
        nomes.removeIf(x -> x.charAt(0) == 'M');

        //Mostra se tem o valor ea primeira posicao que aparece
        System.out.println("Posição do Fabricio = " + nomes.indexOf("Fabricio"));

        //No caso o resultado é -1 pois não existe o valor.. foi retirado acima
        System.out.println("Posição do Maria = " + nomes.indexOf("Maria"));

        //Imprimir nomes
        for (String x:nomes) {
            System.out.println("Nomes = " + x);
        }

        System.out.println("====Filtando valores====");
        //Filtra os valores que tenham determinada letra da lista.. no caso F na posicao 0
        List<String> resultado = nomes.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());

        //Imprimir nomes
        for (String x:resultado) {
            System.out.println(resultado);
        }
    }
}

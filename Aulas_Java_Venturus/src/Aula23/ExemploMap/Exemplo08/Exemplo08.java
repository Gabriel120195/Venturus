package Aula23.ExemploMap.Exemplo08;

import java.util.Map;
import java.util.TreeMap;
public class Exemplo08 {
    public static void main(String[] args) {

        Map<String,String> lista = new TreeMap<>();

        lista.put("Nome", "Gabriel");
        lista.put("Email", "Gabriel@hotmail.com");
        lista.put("Telefone", "(11)954879219");

        //Verifica se existe a chave na lista
        System.out.println("Contem a chave telefone = " + lista.containsKey("Telefone"));

        //Retorna o valor da chave
        System.out.println("Numero do telefone = " + lista.get("Telefone"));
        System.out.println("Email = " + lista.get("Email"));

        //Tamanho da lista
        System.out.println("Tamanho = " + lista.size());


        System.out.println("=========== Lista ==========");

        //Imprime a lista completa
        for (String key: lista.keySet()) {
            System.out.println(key + ": " + lista.get(key));
        }
    }
}

package Aula23.Exemplo02;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressaoString {
    List<String> lista = new ArrayList<>();

    public void adicionaValor(String valor){
        lista.add(valor);
    }

    public String primeiroValor(){
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        }
        return lista.get(0);
    }

    public void imprime(){
        System.out.print("[");
        if (!lista.isEmpty()) {
            System.out.print(lista.get(0));
        }
        for (int i = 1; i < lista.size(); i++) {
            System.out.print(", " + lista.get(i));
        }
        System.out.print("]\n");
    }
}

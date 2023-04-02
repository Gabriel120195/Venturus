package Aula23.ExemploSet.Exemplo06;

import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Double.compare(produto.preco, preco) == 0 && nome.equals(produto.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
}

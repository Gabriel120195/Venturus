package Aula19.Atividade02;

public class Animal {
    private String nome;
    private int idade;
    private boolean fome;

    public void falar(){
    }
    public void comer(){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean getFome() {
        return fome;
    }
    public void setFome(boolean fome) {
        this.fome = fome;
    }

    @Override
    public String toString() {
        return "Animal{" + " Nome= '" + nome + '\'' + ", Idade= " + idade + ", Fome= " + fome + '}';
    }
}
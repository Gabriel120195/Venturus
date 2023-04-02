package Aula21.ExemploAnimais_PolimDeSobrepo;

public class Mamifero extends Animal{
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Bebendo leite");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som do Mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}

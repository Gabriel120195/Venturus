package Aula21.ExemploAnimais_PolimDeSobrepo;

public abstract class Animal {
    protected double peso;

    protected int idade;
    protected int membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}

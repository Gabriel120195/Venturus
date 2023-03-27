package Aula19.Atividade02;

public class Homem extends Animal{
    @Override
    public void falar() {
        System.out.println("Oii");
    }

    @Override
    public void comer() {
        if (this.getFome() == true) {
            System.out.println("Comendo Arroz e Feijão");
        }else {
            System.out.println("Não estou com fome!");
        }
    }
}

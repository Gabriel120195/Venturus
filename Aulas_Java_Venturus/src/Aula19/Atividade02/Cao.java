package Aula19.Atividade02;

public class Cao extends Animal{
    @Override
    public void falar() {
        System.out.println("Au Au");
    }

    @Override
    public void comer() {
        if (this.getFome() == true) {
            System.out.println("Comendo Ração");
        }else {
            System.out.println("O Cão não está com fome!");
        }
    }
}

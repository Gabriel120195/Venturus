package Aula19.Atividade02;

public class Papagaio extends Animal{
    @Override
    public void falar() {
        System.out.println("Qué Café");
    }

    @Override
    public void comer() {
        if (this.getFome() == true) {
            System.out.println("Comendo Ração");
        }else {
            System.out.println("Não estou com fome!");
        }
    }
}

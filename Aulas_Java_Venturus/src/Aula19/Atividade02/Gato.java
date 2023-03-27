package Aula19.Atividade02;

public class Gato extends Animal{
    @Override
    public void falar() {
        System.out.println("Miauu");
    }

    @Override
    public void comer() {
        if (this.getFome() == true) {
            System.out.println("Comendo Ração");
        }else {
            System.out.println("O Gato não está com fome!");
        }
    }
}

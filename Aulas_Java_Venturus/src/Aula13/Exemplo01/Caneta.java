package Aula13.Exemplo01;

public class Caneta {
    String modelo;
    String cor;
    float tamnhoPonta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("Modelo = " + this.modelo);
        System.out.println("Cor = " + this.cor);
        System.out.println("Tamanho da ponta = " + this.tamnhoPonta);
        System.out.println("Carga = " + this.carga);
        System.out.println("Está Tampada? = " + this.tampada);
    }
    void rabiscar() {
        if (tampada == true) {
            System.out.println("Desculpa! Não posso rabiscar!");
        }
        else {
            System.out.println("Estou RABISCANDO!");
        }
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}

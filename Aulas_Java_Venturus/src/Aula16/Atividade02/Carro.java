package Aula16.Atividade02;

public class Carro {
    public String cor;
    public String marca;
    public int ano;
    public int marcha;
    public boolean ligado;
    public int velocidadeAtual;
    public int velocidadeMaxima;

    public Carro(String cor, String marca, int ano,int velocidadeMaxima) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.marcha = 0;
        this.ligado = false;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void mostrarCarro(){
        System.out.println("Marca = " + marca + " / Cor = " + cor + " / Ano = " + ano + " / Ligado = " + ligado + " / Marcha = " + marca +  " / Velocidade atual = " + velocidadeAtual + " Km/h" +  " / Velocidade máxima = " + velocidadeMaxima + " Km/h");
    }
    public void ligar() {
        if (ligado == false) {
            this.ligado = true;
            System.out.println("Carro ligado!");
        }else {
            System.out.println("O carro já está ligado!!");
        }
    }
    public void desligar() {
        if (ligado == true) {
            this.ligado = false;
            System.out.println("Carro desligado");
        }else {
            System.out.println("Carro já está desligado!!");
        }
    }
    public void acelerar() {
        if (ligado == true) {
            if (velocidadeAtual < velocidadeMaxima) {
                this.velocidadeAtual = velocidadeAtual + 10;
                System.out.println("Velocidade Atual = " + velocidadeAtual + " km/h");
                pegarMarcha();
            }else {
                System.out.println("Impossível aumentar a velocidade, Você atingiu a velocidade Máxima!!");
                System.out.println("Velocidade Atual = " + velocidadeAtual + " Km/h");
                pegarMarcha();
            }
        }else {
            System.out.println("O Carro está desligado!");
        }
    }
    public void pegarMarcha() {

            if (velocidadeAtual < 0){
                System.out.println("Marcha = (-1) Ré");
                this.marcha = -1;
            }
            if (velocidadeAtual == 0){
                System.out.println("Marcha = (0) Ponto morto");
                this.marcha = 0;
            }
            if (velocidadeAtual > 0 && velocidadeAtual < 40){
                System.out.println("Marcha = (1) Media");
                this.marcha = 1;
            }
            if (velocidadeAtual >= 40 && velocidadeAtual <= 80){
                System.out.println("Marcha = (2) Alta");
                this.marcha = 2;
            }
            if (velocidadeAtual > 80){
            System.out.println("Marcha = (3) Corrida");
            this.marcha = 3;
            }
        }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}

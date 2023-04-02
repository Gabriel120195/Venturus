package Aula20.Atividade02;

public class Circulo extends Forma{

    private double raio;

    public Circulo(){}

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void area() {
        double area = Math.PI * Math.pow(raio,2);
        System.out.println("Circulo:\n Area = " + area + " Cor = " + getCor());
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
}

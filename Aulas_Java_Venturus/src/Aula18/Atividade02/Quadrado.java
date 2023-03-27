package Aula18.Atividade02;

public class Quadrado implements Formulas{
    private String nome;
    private double lado;
    private Double altura;
    private double base;

    public Quadrado(double lado) {
        this.nome = "Quadrado";
        this.lado = lado;
        this.altura = lado;
        this.base = lado;
    }
    @Override
    public void getNomeFigura() {
        System.out.println(this.nome);
    }
    @Override
    public void getArea() {
        double l = this.base * this.altura;
        System.out.println("Area = " + l + " Cm²");
    }
    @Override
    public void getPerimetro() {
        double p = this.lado + this.lado + this.altura + this.base;
        System.out.println("Perimetro = " + p + " Cm²");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
}

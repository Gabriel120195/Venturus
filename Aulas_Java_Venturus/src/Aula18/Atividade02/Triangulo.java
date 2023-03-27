package Aula18.Atividade02;

public class Triangulo implements Formulas{
    private String nome;
    private double base;
    private double altura;
    private double lado;

    public Triangulo(double base, double altura,double lado) {
        this.nome = "Triângulo";
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public void getNomeFigura() {
        System.out.println(this.nome);
    }
    @Override
    public void getArea() {
        double a = (this.base * this.altura) / 2;
        System.out.println("Area = " + a + " Cm²");
    }
    @Override
    public void getPerimetro() {
        double p = this.base + this.lado + this.altura;
        System.out.println("Perimetro = " + p + " Cm²");
    }

    public double getBase() {
        return base;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
}

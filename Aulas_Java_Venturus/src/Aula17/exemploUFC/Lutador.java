package Aula17.exemploUFC;

public class Lutador {
    private String nome,nacionalidade,categoria;
    private float peso,altura;
    private int idade,vitorias,derrotas,empates;

    public Lutador(String no, String na, float pe, float al,
                   int id, int vi, int de, int em) {

        this.nome = no;
        this.nacionalidade = na;
        this.setPeso(pe);
        this.altura = al;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public void apresentar(){
        System.out.println("===================================");
        System.out.println("Chegou a hora de apresentar o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Ele tem " + this.getIdade() + " anos e " + this.getAltura() + " de altura!");
        System.out.println("No momento pesando " + this.getPeso() + "Kg");
        System.out.println("Tem " + getVitorias() + " Vitórias!");
        System.out.println("Tem " + getDerrotas() + " Derrotas!");
        System.out.println("Tem " + getEmpates() + " Empates!");
    }

    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        }
        else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

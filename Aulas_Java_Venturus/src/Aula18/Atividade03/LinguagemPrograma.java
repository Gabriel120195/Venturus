package Aula18.Atividade03;

public class LinguagemPrograma implements Linguagem{

    public String nome;
    public String linguagem;
    public int Experiencia;

    public LinguagemPrograma(String nome, String linguagem, int experiencia) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.Experiencia = experiencia;
    }

    @Override
    public void pessoa() {
        System.out.println("Nome = " + this.nome);
    }
    @Override
    public void linguagemProgramacao() {
        System.out.println("Linguagem = " + this.linguagem);
    }
    @Override
    public void experiencia() {
        System.out.println("Experiência = " + this.Experiencia + " Anos");
    }
}

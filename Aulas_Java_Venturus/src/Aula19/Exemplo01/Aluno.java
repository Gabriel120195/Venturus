package Aula19.Exemplo01;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("A Matricula será cancelada!");
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + " matricula= " + matricula + ", curso='" + curso + '\'' + '}';
    }
}

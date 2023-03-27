package Aula19.Atividade01;

public class Gerente extends Funcionario{
    private int senha;

    public Gerente() {
        this.senha = 0055;
    }

    public boolean autenticaSenha(int senha){
        if (senha == this.senha) {
            System.out.println("Acesso Permitido!");
            return true;
        }else {
            System.out.println("Acesso Recusado!");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
}

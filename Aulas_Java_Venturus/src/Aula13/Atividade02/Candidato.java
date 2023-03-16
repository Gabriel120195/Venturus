package Aula13.Atividade02;
public class Candidato {
    String vaga;
    String nomeCandidato;
    double pretensaoSalario;
    void status() {
        System.out.println("Nome do candidato = " + this.nomeCandidato);
        System.out.println("Vaga = " + this.vaga);
        System.out.println("Pretensão Salarial: R$ " + this.pretensaoSalario);
    }
    void envioTesteTecnico () {
        if (vaga == "Tecnologia") {
            System.out.println("Enviar teste de Tecnologia para: " + this.nomeCandidato);
        }
        else {
            System.out.println("Enviar teste de Geral para: " + this.nomeCandidato);
        }
    }
}

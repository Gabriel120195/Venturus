package Aula13.Atividade02;

public class CandidatoTeste {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato();
        candidato1.nomeCandidato = "Gabriel";
        candidato1.vaga = "Tecnologia";
        candidato1.pretensaoSalario = 2000.00;
        candidato1.status();
        candidato1.envioTesteTecnico();
        System.out.println(" ");

        Candidato candidato2 = new Candidato();
        candidato2.nomeCandidato = "Laura";
        candidato2.vaga = "Saúde";
        candidato2.pretensaoSalario = 5000.00;
        candidato2.status();
        candidato2.envioTesteTecnico();
        System.out.println(" ");
    }
}

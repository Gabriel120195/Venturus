package Aula10;

import javax.swing.JOptionPane;
public class Ex08 {
    public static void main(String[] args) {

        int mediaAlunos;
        int somaDasNotas = 0;

        for (int i = 1; i <= 3; i++) {

            String nome = JOptionPane.showInputDialog(null,"Nome do Aluno: ");

            for (int j = 1; j <= 2; j++) {

                int nota = Integer.parseInt(JOptionPane.showInputDialog(null,nome + " / " + j + " = Nota:"));

                somaDasNotas = somaDasNotas + nota;
            }
        }
        mediaAlunos = somaDasNotas / 6;

        if (mediaAlunos >= 6) {
            System.out.println("Aprovados!!");
        }
        else {
            System.out.println("Reprovados!!");
        }
        System.out.println("==========");
        System.out.println("Média dos alunos = " + mediaAlunos);
    }
}

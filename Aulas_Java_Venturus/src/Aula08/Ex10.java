package Aula08;

import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int calculoHora = 0;

        System.out.println("Hora Inicial: ");
        int horaInicial = scan.nextInt();

        System.out.println("Hora Final: ");
        int horaFinal = scan.nextInt();

        if (horaInicial > horaFinal) {
            calculoHora = 24 - (horaInicial - horaFinal);
            System.out.println("Duração do jogo = " + calculoHora + " Hrs");
        }
        else if (horaFinal > horaInicial) {
            calculoHora = horaFinal - horaInicial;
            System.out.println("Duração do jogo = " + calculoHora + " Hrs");
        }
        else {
            System.out.println("Duração do jogo = 24 Hrs");
        }
    }
}

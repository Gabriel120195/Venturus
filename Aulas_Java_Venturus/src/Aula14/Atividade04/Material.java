package Aula14.Atividade04;

public class Material {
    int tempo = 0;
    double massa;
    double massaInicial;
    double segundos;
    double minutos;
    double horas;
    void status() {
        System.out.println("Massa Inicial = " + this.massaInicial);
        System.out.printf("Massa Final = " + "%.2f",this.massa);
        System.out.printf("\nSegundos = " + "%.2f",this.segundos);
        System.out.printf("\nMinutos = " + "%.1f",this.minutos);
        System.out.printf("\nHoras = " + "%.1f",this.horas);
    }
    void calculaTempo () {
        this.massaInicial = massa;

        while (massa >= 0.5) {
            this.massa = massa / 2;
            tempo = tempo + 50;
        }
        this.segundos = tempo % 60;
        this.minutos = segundos / 60;
        this.horas = minutos / 60;
    }
}

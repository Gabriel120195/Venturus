package Aula17.exemploUFC;

public class LutaTeste {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Bob","França",68.9f,1.75f,31,11,2,1);
        l[1] = new Lutador("Cadu","Brasil",57.8f,1.68f,29,14,2,3);
        l[2] = new Lutador("Stephen","EUA",80.9f,1.65f,35,12,2,1);
        l[3] = new Lutador("Richard","Austrália",81.6f,1.93f,28,13,0,2);
        l[4] = new Lutador("Pedro","Brasil",119.3f,1.70f,37,5,4,3);
        l[5] = new Lutador("Pitter","USA",105.7f,1.81f,30,12,2,4);

        Luta ufc = new Luta();

        ufc.marcarLuta(l[4],l[5]);
        ufc.lutar();
        System.out.println(" ");

        ufc.marcarLuta(l[1],l[5]);
        ufc.lutar();
        System.out.println(" ");
    }
}

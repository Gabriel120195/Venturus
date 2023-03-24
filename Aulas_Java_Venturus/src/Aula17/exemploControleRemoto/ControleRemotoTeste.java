package Aula17.exemploControleRemoto;

public class ControleRemotoTeste {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.ligar();
        controleRemoto.play();
        controleRemoto.maisVolume();
        controleRemoto.maisVolume();
        controleRemoto.abrirMenu();
        controleRemoto.fecharMenu();
    }
}

package Aula20.Atividade02;

public abstract class Forma {
    private Cor cor;

    public abstract void area();

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}

package Aula17.ex01_Motor;

public class Motor implements ControladorDeMotor{
    public boolean ligado;
    private int gasolina;

    public Motor() {
        this.ligado = false;
        this.gasolina = 0;
    }
    @Override
    public void ligar() {
        boolean temGasolina = temGasolina();

        if (temGasolina == true) {
            System.out.println("O motor foi Ligado!!");
        }else {
            System.out.println("Motor sem Gasolina!!");
        }
    }
    @Override
    public boolean temGasolina() {
        if (this.getGasolina() > 0) {
            return true;
        }else {
            return false;
        }
    }

    public int getGasolina() {
        return gasolina;
    }
    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
}

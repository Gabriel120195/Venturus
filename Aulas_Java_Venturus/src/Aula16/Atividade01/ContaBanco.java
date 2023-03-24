package Aula16.Atividade01;

public class ContaBanco {
    public int numConta;
    public String tipo;
    private String dono;
    private double saldo;

    protected boolean status;

    public ContaBanco() {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }
    public  void  mostrarConta(){
        if (status == true) {
            System.out.println("Numero conta = " + getNumConta() + " / Tipo = " + getTipo() + " / Dono = " + getDono() + " / Saldo = R$ " + getSaldo());
        }else {
            System.out.println("Crie sua conta!");
        }
    }
    public void abrirConta(){
        if (tipo == "CC" || tipo == "CP") {
            if (tipo == "CC") {
                this.saldo = saldo + 50.00;
                this.status = true;
                System.out.println("Conta Corrente criada.\nFoi Depositado o valor de R$ 50,00 em sua conta!");
            }
            if (tipo == "CP") {
                this.saldo = saldo + 150.00;
                this.status = true;
                System.out.println("Conta Poupança criada.\nFoi Depositado o valor de R$ 150,00 em sua conta!");
            }
        } else {
            System.out.println("Tipo de conta não existente! procure uma agência!");
        }
    }
    public void fecharConta(){
        if (saldo == 0) {
            System.out.println("Conta Fechada!");
            this.status = false;
        }else if (saldo < 0){
            System.out.println("Impossivel fechar a conta! Você tem valores á pagar\nSeu saldo: R$ " + getSaldo());
        }else {
            System.out.println("Impossivel fechar a conta! Você precisa retirar todos os valores da conta!\nSeu saldo: R$ " + getSaldo());
        }
    }
    public void depositar(double valDeposito){

        if (valDeposito > 0 && status == true) {
            double depositado = this.saldo + valDeposito;
            this.saldo = depositado;
            System.out.println("Valor Depositado: R$ " + valDeposito + " / Na Conta: " + getNumConta());
        }else {
            System.out.println("Impossivel depositar esse valor! Tente novamente");
        }
    }
    public void sacar(double valSaque){
        if (saldo > valSaque) {
            double sacado = this.saldo - valSaque;
            this.saldo = sacado;
            System.out.println("Valor Sacado: R$ " + valSaque + " / Na Conta: " + getNumConta());
        }else {
            System.out.println("Impossivel realizar Saque! O Saldo da sua conta é menor que o valor do saque!");
        }
    }
    public void pegarMensal(){
        if (tipo == "CC"){
            System.out.println("Após 30 dias de uso, será cobrado o valor de R$ 12,00 de sua Conta Corrente!");
        }
        if (tipo == "CP"){
            System.out.println("Após 30 dias de uso, será cobrado o valor de R$ 20,00 de sua Conta Poupança!");
        }

    }
    public  void  status() {
        if (status == true) {
            System.out.println("Conta Ativa!");
        }else {
            System.out.println("Conta Desativa");
        }
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}

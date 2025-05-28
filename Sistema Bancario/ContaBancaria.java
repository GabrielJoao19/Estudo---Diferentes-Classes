public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private int saldo;

    public ContaBancaria(int numeroConta, String titular, int saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(int valor){
        this.saldo = saldo + valor;
    }

    public void sacar(int valor){
        this.saldo = saldo - valor;
    }

    public String consultarSaldo(){
        return "Saldo: " + saldo;
    }
}
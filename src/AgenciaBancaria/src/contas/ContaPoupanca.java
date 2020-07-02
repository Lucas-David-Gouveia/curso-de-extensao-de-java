package contas;

public class ContaPoupanca extends Conta {
    
    private double saldoPoupanca;
    
    public ContaPoupanca(String nome, int numero, double saldo, double saldoPoupanca) {
        super(nome, numero, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }
    
    public double getPoupanca() {
        return saldoPoupanca;
    }
    
    @Override
    public String exibirTipo() {
        return "Conta poupança";
    }
        
    public void depositarPoupanca(double valor) {
        saldoPoupanca += valor;
    }
           
    public boolean sacarPoupanca(double valor){
        if(saldoPoupanca >= valor) {
            this.saldoPoupanca -= valor;
            return true;
        } else {
            return false;
        }
    }
}
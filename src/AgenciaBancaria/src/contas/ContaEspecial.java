package contas;

public class ContaEspecial extends Conta {
    
    private double saldoLimite;
    
    public ContaEspecial(String nome, int numero, double saldo) {
        super(nome, numero, saldo);
        saldoLimite = 500;
    }
    
    public double getSaldoLimite() {
        return saldoLimite;
    }
    
    @Override
    public String exibirTipo() {
        return "Conta especial";
    }
        
    public boolean sacarLimite(double valor) {
        
        if(saldoLimite >= valor) {
            saldoLimite -= valor;
            return true;
        } else {
            return false;
        }
    }
}
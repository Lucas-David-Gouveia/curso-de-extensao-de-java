package contas;

public class Conta {
    
    protected String nome;
    protected int numero;
    protected double saldo;
        
    // Construtores
    
    public Conta(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        saldo = 0;
    }
    
    public Conta(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    // Getters

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    // Métodos
    
    public String exibirTipo() {
        return "Conta genérica";
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public boolean sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
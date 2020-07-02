package contas;

public class ContaUniversitaria extends Conta {
    
    private String curso;
    
    public ContaUniversitaria(String nome, int numero, double saldo, String curso) {
        super(nome, numero, saldo);
        this.curso = curso;
    }
    
    public String getCurso() {
        return curso;
    }
    
    @Override
    public String exibirTipo() {
        return "Conta universitária";
    }
    
    @Override
    public void depositar(double valor) {
        saldo += valor*1.05; // + 5% do valor depositado
    }
}
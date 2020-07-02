package funcionarios;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }
    
    // Métodos
    
    @Override
    public double getBonificacao() {
        return salario * 1.15;
    }
}
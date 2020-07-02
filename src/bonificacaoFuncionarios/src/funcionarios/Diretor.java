package funcionarios;

public class Diretor extends Funcionario {
    
    public Diretor(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }
    
    // Métodos
    
    @Override
    public double getBonificacao() {
        return salario * 1.10;
    }
}
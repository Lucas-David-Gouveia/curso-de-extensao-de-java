package funcionarios;

public class Funcionario {
    
    protected String nome;
    protected double salario;
    protected String cargo;
    
    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Getters
    
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
    
    // Métodos
    
    public double getBonificacao() {
        return salario * 1.05;
    }
}
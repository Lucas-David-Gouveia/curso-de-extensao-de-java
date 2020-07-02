package bonificacaofuncionarios;

import funcionarios.*;

public class BonificacaoFuncionarios {

    public static void main(String[] args) {
        
        Gerente g = new Gerente("João", 8000, "gerente");
        Diretor d = new Diretor("Maria", 6000, "diretor");
        Engenheiro e = new Engenheiro("Pedro", 4000, "engenheiro");
        Secretario s = new Secretario("Ana", 3000, "secretario");
        
        System.out.println(g.getNome() + " é " + g.getCargo());
        System.out.println("Salário + bonificação: " + g.getBonificacao());
        
        System.out.println("");
        
        System.out.println(d.getNome() + " é " + d.getCargo() + "(a)");
        System.out.println("Salário + bonificação: " + d.getBonificacao());
        
        System.out.println("");
        
        System.out.println(e.getNome() + " é " + e.getCargo() + "(a)");
        System.out.println("Salário + bonificação: " + e.getBonificacao());
        
        System.out.println("");
        
        System.out.println(s.getNome() + " é " + s.getCargo() + "(a)");
        System.out.println("Salário + bonificação: " + s.getBonificacao());
    }
}
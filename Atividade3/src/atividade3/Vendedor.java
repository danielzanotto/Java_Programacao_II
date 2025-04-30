/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class Vendedor extends Empregado {
    // declarando os atributos da classe
    private float PrecentualComissao;

    
    //construtor da classe
    public Vendedor() {//convoca a cçasse mãe e adiciona as atribuições exclusivas da classe filha.
        super(); // chamando o construtor da super classe
        this.PrecentualComissao = 5;
    }
    // método da classe
    public void InserirDados() {
      super.setNome ("Marcelo");
      super.setSalario (12.545);
    }
    public void Exibir() {
        String aux = "\nDados da Conta Corrente";
        
        aux += "Nome: " + super.getNome() + "\n";
        aux += "Salário: " + super.getSalario() + "\n";
        aux += "Percentual de comissão: " + this.PrecentualComissao + "%\n";
        
        JOptionPane.showMessageDialog(null, aux);
    }
    public float CalcularOSalario(float SalarioComComissao){
        SalarioComComissao = super.getSalario() + (super.getSalario()*PrecentualComissao/100);
                String aux = "\nDados da Conta Corrente";
        
        aux += "Nome: " + super.getNome() + "\n";
        aux += "Salário sem comissão: " + super.getSalario() + "\n";
        aux +- "Salário com comissão: " + String.format("%.2f", SalarioComComissao);
        aux += "Percentual de comissão: " + this.PrecentualComissao + "%\n";
        
        JOptionPane.showMessageDialog(null, aux);
        return SalarioComComissao;

    }
}

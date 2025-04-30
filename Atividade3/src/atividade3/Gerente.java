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
public class Gerente extends Empregado {
    // declarando os atributos da classe
    private ToString Departamento;
    
    //construtor da classe
    public Gerente() {
        super(); // chamando o construtor da super classe
        this.Departamento = "1 Bloco A";
 
    }
    // método da classe
    public void InserirDados() {
      super.setNome ("Marcela");
      super.setSalario (22545);
    }
    public void Exibir() {
        String aux = "\nDados da Conta Corrente";
        
        aux += "Nome: " + super.getNome() + "\n";
        aux += "Salario: " + super.getSalario() + "\n";
        aux += "Departamento: " + this.Departamento + "\n";
        
        JOptionPane.showMessageDialog(null, aux);
    }
}


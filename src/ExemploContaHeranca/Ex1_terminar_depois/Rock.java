/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploContaHeranca;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class Rock extends Musicais {
    // declarando os atributos da classe
    private double limite;
    
    //construtor da classe
    public Rock() {
        super(); // chamando o construtor da super classe
        this.limite = 0;
    }
    // método da classe
    public void InserirDados() {
      super.setNome ("Henrique Mattos");
      super.setBanco ("001 - Banco do Brasil");
      super.setAgencia ("0978-8");
      super.setNroConta ("22.545-9");
    }
    public void Apresentar() {
        String aux = "\nDados da Conta Corrente";
        
        aux += "Nome: " + super.getNome() + "\n";
        aux += "Banco: " + super.getBanco() + "\n";
        aux += "Agência" + super.getAgencia() + "\n";
        aux += "Nro da Conta: " + super.getNroConta() + "\n";
        aux += "Limite da Conta: " + this.limite + "\n";
        
        JOptionPane.showMessageDialog(null, aux);
    }
}

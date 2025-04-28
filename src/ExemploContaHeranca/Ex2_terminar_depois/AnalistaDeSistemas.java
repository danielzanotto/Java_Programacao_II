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
public class AnalistaDeSistemas extends Funcionario {
    // declarando os atributos da classe
    private String Mestrado;
    private String MesesDeExperiencia;
    
    //construtor da classe
    public AnalistaDeSistemas() {
        super(); // chamando o construtor da super classe
        this.Mestrada = "possui";
        this.MesesDeExperiencia = "12 meses";
    }
    // método da classe
    public void InserirDados() {
      super.setNome ("Marcela");
      super.setAnoDeNascimento ("26/03/1993");
      super.setCpf ("109788-05848");
      super.setSalario ("22.545");
    }
    public void Exibir() {
        String aux = "\nDados da Conta Corrente";
        
        aux += "Nome: " + super.getNome() + "\n";
        aux += "Ano de Nascimento: " + super.getAnoDeNascimento() + "\n";
        aux += "CPF" + super.getCpf() + "\n";
        aux += "Salario: " + super.getSalario() + "\n";
        aux += "Mestrado: " + this.Mestrado + "\n";
        aux += "Meses de Experiencia: " + this.MesDeExperiencia + "\n";
        
        JOptionPane.showMessageDialog(null, aux);
    }
}

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
public class Programador extends Funcionario {
    // declarando os atributos da classe
    private String Graduacao;
    private String Certificado;
    
    //construtor da classe
    public AnalistaDeSistemas() {//convoca a cçasse mãe e adiciona as atribuições exclusivas da classe filha.
        super(); // chamando o construtor da super classe
        this.Graduacao = "possui";
        this.Certificado ="Java";
        this.Sexo ="H";
    }
    // método da classe
    public void InserirDados() {
      super.setNome ("Marcelo");
      super.setAnoDeNascimento ("26/03/1993");
      super.setCpf ("109788-05849");
      super.setSalario ("12.545");
    }
    public void Exibir() {
        String aux = "\nDados da Conta Corrente";
        
        aux += "Nome: " + super.getNome() + "\n";
        aux += "Ano de Nascimento: " + super.getAnoDeNascimento() + "\n";
        aux += "CPF" + super.getCpf() + "\n";
        aux += "Salario: " + super.getSalario() + "\n";
        aux += "Graduação: " + this.Graduacao + "\n";
        aux += "Certificado em: " + this.Certificado + "\n";
        aux += "Sexo: " + this.Certificado + "\n";
        
        JOptionPane.showMessageDialog(null, aux);
    }
}

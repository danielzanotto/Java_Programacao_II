/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploContaHeranca;

/**
 *
 * @author ALUNO
 */
public class Musicais { // classe Pai
    // declarando os atributos da classe
    private String Nome;
    private String NroConta;
    private String Agencia;
    private String Banco;
    private final double Saldo; // final é uma constante
    
    // construtor da classe
    public Musicais () { // método construtor sem parâmetro (mesmo nome da classe)
     this.Nome = "Nome do cliente";
     this.NroConta = "Número da conta";
     this.Agencia = "Agência";
     this.Banco = "Banco";
     this.Saldo = 0;
    }
    
     // método da classe
     public void MostrarSaldo() {
         System.out.println("Saldo: R$ " + String.format("%.2f", this.Saldo)); 
         // duas casas decimais
     }
     // métodos get´s e set´s
     public String getNome() {
         return Nome;
     }
     public void setNome(String Nome) {
         this.Nome = Nome;
     }
     public String getNroConta() {
         return NroConta;
     }
     public void setNroConta(String NroConta) {
         this.NroConta = NroConta;
     }
     public String getAgencia() {
         return Agencia;
     }
     public void setAgencia(String Agencia) {
         this.Agencia = Agencia;
     }
     public String getBanco () {
         return Banco;
     }
     public void setBanco(String Banco) {
         this.Banco = Banco;
     }
    }
  

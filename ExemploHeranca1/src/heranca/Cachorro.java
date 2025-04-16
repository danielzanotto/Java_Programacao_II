/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

public class Cachorro extends Animal{
 private String nome;
 private String alimentacao;
 public void InserirDadosCachorro(){
     super.setRaca("Golden");
     super.setPeso("50kg");
     super.setTamanhoMaximo("Média 55 de comprimento e 45cm de altura");
     this.nome = "Peter";
     this.alimentacao = "Ração Premier";
     
 }
 public void ApresentarVaca(){
     System.out.println("Raça....: " + super.getRaca());
     System.out.println("Tamanho Maximo ....: " +super.getTamanhoMaximo());
     System.out.println("Peso da vaca....: "+ super.getPeso());
     System.out.println("Nome....: "+this.nome);
     System.out.println("Alimentação....: "+this.alimentacao);
     
 }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

public class Vaca extends Animal{
 private String ambiente;
 private String caracteristica;
 public void InserirDadosVaca(){
     super.setRaca("Nelore");
     super.setPeso("600kg");
     super.setTamanhoMaximo("Média 165 de comprimento e 155cm de altura");
     this.ambiente = "Terra";
     this.caracteristica = "Fêmeas apresentam musculatura menos desenvolvida";
     
 }
 public void ApresentarVaca(){
     System.out.println("Raça da vaca....: " + super.getRaca());
     System.out.println("Tamanho Maximo ....: " +super.getTamanhoMaximo());
     System.out.println("Peso da vaca....: "+ super.getPeso());
     System.out.println("Ambiente da vaca....: "+this.ambiente);
     System.out.println("Caracteristica....: "+this.caracteristica);
     
 }
}

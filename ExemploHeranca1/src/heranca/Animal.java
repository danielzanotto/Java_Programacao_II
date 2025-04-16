/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

public class Animal {
    private String raca; //private só a classe animal reconhece ele.
    private String tamanhomaximo;
    private String peso; //castion -> converter para outro double.
    
    public void MostrarRaca() {
        System.out.println("Raça do animal: "+this.raca);
    }
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getTamanhoMaximo(){
        return tamanhomaximo;
    }
    public void setTamanhoMaximo(String tamanhoMaximo){
        this.tamanhomaximo = tamanhomaximo;
    }
    public String getPeso(){
        return peso;
    }
    public void setPeso(String peso){
        this.peso = peso;
    }
}

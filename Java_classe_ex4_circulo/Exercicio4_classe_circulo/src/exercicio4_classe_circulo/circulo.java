
package exercicio4_classe_circulo;
public class circulo {
    public Double raio; //atributo
    
    public Double calcularArea(){ //metodo
        return Math.PI*Math.pow(this.raio, 2); //pow elevado o valor a outro neste caso (2)
    }
    public Double calcularPerimetro(){ // this = atributo da propria classe.
         return 2*Math.PI*this.raio;
    }
    public void imprimirArea(){
        System.out.println(calcularArea());
    }
    public void imprimirPerimetro(){
        System.out.println(calcularPerimetro());
    }
    public String dados(){ // devolve apenas o string de saida
        return "Circulo raio =["+raio+"]";}
 }
//powerbia, sql -> big data.
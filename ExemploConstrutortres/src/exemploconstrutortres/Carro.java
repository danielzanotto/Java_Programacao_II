
package exemploconstrutortres;

public class Carro {
    private String cor;
    private double preco;
    private String modelo;
    
    public Carro(){    
    }
    public Carro(String modelo, double preco){
    //se for escolhido o construtor sme a COR do veiculo
    //definimos como a cor padrão preta
    this.cor = "PRETA"; //this metodo da propria classe
    this.modelo = modelo;
    this.preco = preco;
    }
    //Construtor com 3 parametors
    public Carro(String cor, String modelo, double preco){
        this.cor = cor;
        this.modelo = modelo;
        this.preco = preco;
    }  
}
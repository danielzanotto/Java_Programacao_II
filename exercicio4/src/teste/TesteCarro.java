package teste;
import biblio.Carro;
import biblio.Sedan;

public class TesteCarro {
    
  public static void main(String[] args){
      Carro fit = new Carro(); //ele entende as classes e as extend...
      Sedan civic = new Sedan();
      fit.marca = "Honda";
      fit.ano = 2014;
      fit.preco = 55000;
      
//      civic.marca = "Honda";
      civic.marca = "Honda";
      civic.ano = 2014;
      civic.preco = 50000;
      civic.portaMalas= 450;
      
  }  
}


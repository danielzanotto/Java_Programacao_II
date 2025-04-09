
package construtorComParametro;
public class Aluno {
          public String nome;
          public double notaMat,
                        notaFis,
                        media;
   public Aluno(){ //contrutor padrão sem parametros;
       
       System.out.println("Objeto Criado");
   }
        public Aluno(String Nome, double NotaMat, double NotaFis){ // esse construtor da classe vair ter valores que seram passados para os atributos).
        ///passagem de valor com transferencia de valor -transferencia de valor e comunicação entre classes.
            nome = Nome;
            notaMat=NotaMat;
            notaFis=NotaFis;
            
           media = (notaMat +notaFis)/2;
        }
    //Declaração de uma variavel como denifinir parametros internos, podendo inicializar tipos de informação.
    //Declaração de uma classe como o objeto de mesmo nome que a classe criada.
}
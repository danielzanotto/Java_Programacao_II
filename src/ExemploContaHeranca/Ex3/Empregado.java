
package ExemploContaHeranca;//Modififque o nome da pasta 

public class Empregado { // classe Pai
    // declarando os atributos da classe
    private String Nome;
    protected final float Salario;

    
    // construtor da classe
    public Empregado () { // método construtor sem parâmetro (mesmo nome da classe)
     this.Nome = "Nome do Empregado";
     this.Salario = 1800;

    }
    
     // método da classe
     public void Exibir() {
         System.out.println("Nome do Empregado: " + this.Nome);
         System.out.println("\nDepartamento: "+this.Departamento);
         System.out.println("\nSalário sem comissão: "+ String.format("%.2f", this.Salario));
         System.out.println("\nSalário com comissão: "+ String.format("%.2f", this.SalarioComComissao));
         System.out.println("\nPercentuPercentual de comissão" + this.PrecentualComissao +"%");
     }
     // métodos get´s e set´s
     public String getNome() {
         return Nome;
     }
     public void setNome(String Nome) {
         this.Nome = Nome;
     }

          public String getSalario() {
         return Salario;
     }
     public void setSalario(String Salario) {
         this.Salario = Salario;
     }

    }
  

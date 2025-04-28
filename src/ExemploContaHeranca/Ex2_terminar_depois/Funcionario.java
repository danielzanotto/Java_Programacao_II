
package ExemploContaHeranca;//Modififque o nome da pasta 

public class Funcionario { // classe Pai
    // declarando os atributos da classe
    private String Nome;
    private String AnoDeNascimento;
    private String Cpf;
    private final double Salario;

    
    // construtor da classe
    public Funcionario () { // método construtor sem parâmetro (mesmo nome da classe)
     this.Nome = "Nome do Funcionario";
     this.AnoDeNascimento = "Ano de Nascimento";
     this.Cpf = "Cpf";
     this.Salario = "Dinheiro";

    }
    
     // método da classe
     public void Exibir() { //após fazer a verificação do programa apagar os Systemout "Não esquece Daniel!"
         System.out.println("Nome do funcionário: " + this.Nome);
         System.out.println("\n Ano de Nascimento: "+ this.AnoDeNascimento);
         System.out.println("\n CPF: "+this.Cpf);
         System.out.println("\n Salário R$: "+ String.format("%.2f", this.Salario));
     }
     // métodos get´s e set´s
     public String getNome() {
         return Nome;
     }
     public void setNome(String Nome) {
         this.Nome = Nome;
     }
     public String getAnoDeNascimento() {
         return AnoDeNascimento;
     }
     public void setAnoDeNascimento(String AnoDeNascimento) {
         this.AnoDeNascimento = AnoDeNascimento;
     }
     public String getDinheiro() {
         return Dinheiro;
     }
     public void setDinheiro(String Dinheiro) {
         this.Dinheiro = Dinheiro;
     }
          public String getCpf() {
         return Cpf;
     }
     public void setCpf(String Cpf) {
         this.Cpf = Cpf;
     }


     /** métodos get´s e set´s
    
     public String getxxx() {
         return xxx;
     }
     public void setxxx(String xxx) {
         this.xxx = xxx;
     }

     **/
    }
  

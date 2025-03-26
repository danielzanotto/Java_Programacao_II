
package exercicio2_classe;

import java.util.Date; //Para utilizarmos a data importamos o Date

public class agenda{
        //
public String nome;
public String endereco;
public String telefone;
public Date dataNascimento;
  
    public void MostrarDados(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Endereço: " +this.endereco);
        System.out.println("Telefone: " +this.telefone);
        System.out.println("Data de Nascimento: " +this.dataNascimento);
        // o que o this representa ? ele referencia o atributo
        System.out.println("============================================");
            
    }
}

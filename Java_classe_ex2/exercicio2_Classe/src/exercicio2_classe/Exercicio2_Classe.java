
//encapsulamento, polimorfismo, herança, todos eles precisam de um objeto. 
//classsse principal deve ser sempre a mais limpa possivel evitando ter dados nela apenas as funções diferente do exemplo a seguir:
package exercicio2_classe;
import java.util.Date;
public class Exercicio2_Classe {
    public static void main(String[] args) {
   agenda debora = new agenda();
   //new Date(); -> busca a data do sistema.
        debora.nome="Deborah";
        debora.endereco= "Rua X 123";
        debora.telefone ="(11) 9 8897-2859" ;
        debora.dataNascimento= new Date();
        debora.MostrarDados();
        
    agenda ademir = new agenda();
        ademir.nome="Ademir";
        ademir.endereco= "Rua Y 123";
        ademir.telefone ="(11) 9 8897-1234" ;
        ademir.dataNascimento= new Date();
        ademir.MostrarDados();
    
    
    agenda vagner = new agenda();
    
        vagner.nome="Vagner";
        vagner.endereco= "Rua Z 123";
        vagner.telefone ="(11) 9 4321-1234" ;
        vagner.dataNascimento= new Date();
        vagner.MostrarDados();
        
    agenda suzana = new agenda();
    
        suzana.nome="Suzana";
        suzana.endereco= "Rua A 123";
        suzana.telefone ="(11) 9 4321-1234" ;
        suzana.dataNascimento= new Date();
        suzana.MostrarDados();

        agenda cleiton = new agenda();
    
        cleiton.nome="Cleiton";
        cleiton.endereco= "Rua B 123";
        cleiton.telefone ="(11) 9 4333-1234" ;
        cleiton.dataNascimento= new Date();
        cleiton.MostrarDados();
    }
    
}


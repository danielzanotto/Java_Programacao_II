// Exercicio 3 - nome sde classe - utilizanção de funções - 
package exercicio3_classe;

public class Exercicio3_classe {

    public static void main(String[] args) {
        // TODO code application logic here
     serhumano Sergio = new serhumano();
     serhumano Anderson = new serhumano();

     Sergio.idade = 90;
     Sergio.nome ="Sergio Montagner";
     Sergio.corDosOlhos = "Verde";
     Sergio.corDosCabelos = "Grisalhos";
     Sergio.MostrarDados();
     Sergio.falar();
     Sergio.dormir();
     
     Anderson.idade = 90;
     Anderson.nome ="Sergio Montagner";
     Anderson.corDosOlhos = "Castanho";
     Anderson.corDosCabelos = "Loiro escuro";
     Anderson.MostrarDados();
     Anderson.falar();
     Anderson.dormir();
     //Classe - Objeto - Atributo -> Só consigo utilizar os metodos da minha classe quando tenho um objeto.
    }
    
}

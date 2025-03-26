
package exercicio3_classe;

public class serhumano {
   //metodos publicos = global (em linguagens de programação estruturadas) e privado, protegido, padrão.
    //nomes de atributos começam com letras minusculas.
   public String nome;
   public int idade;
   public String corDosOlhos;
   public String corDosCabelos;
   
   public void falar(){
       System.out.println("Oi!!! Eu sou humano");
   }
   public void dormir(){
       System.out.println("zZzZzZzZzZ!!! \n\n");
   }
   public void MostrarDados()
   {
       System.out.println("Nome"+this.nome);
       System.out.println("Idade"+this.idade);
       System.out.println("Cor dos olhos"+this.corDosOlhos);
       System.out.println("Cor do cabelo"+this.corDosCabelos);
   }
}

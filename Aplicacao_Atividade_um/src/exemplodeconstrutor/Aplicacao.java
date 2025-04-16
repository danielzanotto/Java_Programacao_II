/*
Daniel Zanotto Aracena
 */
package exemplodeconstrutor;
import java.util.Scanner;
public class Aplicacao {

    public static void main(String[] args) {
        
        String[] nome = new String[3];
        Double[] notaMat = new Double[3];
        Double[] notaFis = new Double[3];
      //entrada =
      Scanner entrada = new Scanner (System.in);
      for (int i = 0; i<3; i++)
      {
          System.out.print("Nome do aluno: ");
          nome[i]= entrada.nextLine();
          
          System.out.println("Nota de matematica: ");
          notaMat[i]= entrada.nextDouble();

          System.out.println("Nota de Física: ");
          notaFis[i]= entrada.nextDouble();
          entrada.nextLine(); //serve para limpar o cache e fazer funcionar.
      }
      for (int i=0; i<3; i++)
      {
          Aluno fulano = new Aluno(nome[i], notaMat[i], notaFis[i]);
          System.out.printf("O aluno \"%s\"tirou %2.2f em Matemática, "+ "%2.2f em Física e obteve média %2.2f \n", fulano.nome, fulano.notaMat, fulano.notaFis, fulano.media);
      }    
          }
    
}

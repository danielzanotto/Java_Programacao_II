
package ConstrutorComParametro;
import construtorComParametro.Aluno;
import java.util.Scanner; //classe necessária para a utilização do scanner

public class Aplicacao {

    public static void main(String[] args) {
      //Aluno donafifi = new Aluno(); - GUARDAR. VERSÃO DEFAULT (OMISSÃO DE VARIAVEIS,)
      
      String nome;
      Double notaMat,
             notaFis;
      //entrada de dados na variavel
    
        Scanner entrada = new Scanner (System.in);
        System.out.println("Nome do aluno: ");
        nome = entrada.nextLine();
        
        System.out.println("Nota em Matemática: ");
        notaMat= entrada.nextDouble();
        
        System.out.println("NOta em Física: ");
        notaFis = entrada.nextDouble();
        
        //criando construtor om 3 argumentos
        Aluno fulano = new Aluno(nome, notaMat, notaFis);
        System.out.printf("O aluno \"%s\"tirou %2.2f em Matemática, "+"%2.2f em Física e obteve média %2.2f\n",
        fulano.nome,
        fulano.notaMat,
        fulano.notaFis,
        fulano.media);
        //motivo: %s formato de saida, nome 
    }
}

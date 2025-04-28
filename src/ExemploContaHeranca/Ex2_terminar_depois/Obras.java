//Daniel Zanotto Atividade 3
package ExemploContaHeranca; //mude o nome da pasta.

public class Principal {

    /**
     Verifica se apagou o System out do Funcionario e lembre de terminar o programa para gerar 5 funcionarios aleatorios.
     */
    public static void main(String[] args) {
       Programador Marcelo = new Programador();
       AnalistaDeSistemas Marcela = new AnalistaDeSistemas();
    
       
       Marcela.InserirDados();
       Marcela.Exibir();
        System.out.println("");

       Marcelo.InserirDados();
       Marcelo.Exibir();
        System.out.println("");

    
    }
    
}
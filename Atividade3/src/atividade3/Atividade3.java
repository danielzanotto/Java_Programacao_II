//Daniel Zanotto Atividade 3
package Atividade3; //mude o nome da pasta.

public class Atividade3 {

    /**
     Verifica se apagou o System out do Funcionario e lembre de terminar o programa para gerar 5 funcionarios aleatorios.
     */
    public static void main(String[] args) {
    Empregado nova =new Empregado();
       Vendedor Marcelo = new Vendedor();
       Gerente Marcela = new Gerente();
       
    nova.Exibir();
       
       Marcela.InserirDados();
       Marcela.Exibir();
        System.out.println("");

       Marcelo.InserirDados();
       Marcelo.CalcularOSalario();
        System.out.println("");

    
    }
    
}
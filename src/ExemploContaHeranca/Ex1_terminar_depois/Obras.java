//Daniel Zanotto Atividade 3
package ExemploContaHeranca;

public class Obras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conta conta = new Conta();
       Conta_Corrente corrente = new Conta_Corrente();
       Conta_Poupanca poupanca = new Conta_Poupanca();
       
       conta.MostrarSaldo();
        System.out.println("");
       
       corrente.InserirDados();
       corrente.Apresentar();
        System.out.println("");
        
        poupanca.InserirDados();
        poupanca.Apresentar();
        System.out.println("");
    }
    
}

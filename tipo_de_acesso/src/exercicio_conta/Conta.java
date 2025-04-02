
package exercicio_conta;

public class Conta {
    String titular; 
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura; //pode colocar string ou date (especifico e importaria)
    
    private void saca (double valor) {//default#sem nada antes (void) - acesso padrão- (identificado por todas as classes dentro do mesmo pacote) privat
        this.saldo -= valor;
    }
    void deposita (double valor){
        this.saldo += valor;
    }
    double calculaRendimento(){
            return this.saldo* 0.1;
    }
    String recuperaDadosParaImpressao()
    {
        String dados = "Titular" + this.titular; //concatenando
        dados +="\nNúmero: "+this.numero;
        dados +="\nAgência: "+ this.agencia;
        dados +="\nSaldo: R$ "+ this.agencia;
        dados +="\nData de abertura: "+ this.dataDeAbertura;        
        return dados;
    }
}
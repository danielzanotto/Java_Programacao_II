
package calculaseprimo;

public class CalcularPrimoAntecessor extends CalculaSePrimo{
  //praticando a sobreescrita
    @Override
    public String CalculaSePrimo(int nro){
        int i, cont;
    while(true){
        cont = 0;
        for(i = 1; i<=nro;i++){
            if (nro% i == 0){
                cont++;
            }
        }
    if (cont <=2){
        return "nro: "+nro+" antecessor é primo!";
    }else{
        nro-=1;
    }
    }
    }
}
//nota de prova + nota da atividade ->
//Java com interface grafica -> Projeto de trabalho valendo 2 pontos.
//Java P2 Banco de dados;
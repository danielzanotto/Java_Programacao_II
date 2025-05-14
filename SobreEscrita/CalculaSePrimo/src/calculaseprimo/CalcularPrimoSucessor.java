
package calculaseprimo;
public class CalcularPrimoSucessor extends CalculaSePrimo {
    //praticando a sobreescrita
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
        nro+=1;
    }
    }
    }
}
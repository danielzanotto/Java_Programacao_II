
package calculaseprimo;
//metodo da classe
public class CalculaSePrimo {
//metodo classe
public String CalculaSePrimo(int nro){
        // TODO code application logic here
       int i, cont = 0;
       for (i = 1; i<=nro; i++){
           if(nro % i ==0){ //calcula se o valor de retorno será igual a 0
               cont ++;
           }
       }
       if (cont<=2){
           return "O nro: "+nro+"é primo!";
       }else{
           return "O nro: "+nro+"não é primo!";
       }
    }
}
//encapsulamento -> ocultamento de informações.

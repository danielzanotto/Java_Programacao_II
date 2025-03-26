//Faça um projeto em Java
//receba doi numeros inteiros positivos.
//A classe deve retonara a soma dos N numeros inteiros existente entre eles.
package atividade;
import java.util.InputMismatchException; //entradas de numeros numericos ?
import java.util.Scanner;
public class Atividade {

    public static void main(String[] args) {
        soma somaintervalo = new soma();
        Scanner sc = new Scanner(System.in);
       
        int valor_um,valor_dois;
        try{
            System.out.println("Digite o primeiro valor: ");
            valor_um = sc.nextInt();
            
            System.out.println("Digite o segundo valor: ");
            valor_dois = sc.nextInt();
            
           somaintervalo.valor_um = valor_um;
           somaintervalo.valor_dois = valor_dois;
           
            System.out.println("Soma:"+somaintervalo.somarIntervalo());
        } catch(InputMismatchException ex){
            System.out.println("Erro de digitação");
    }
}


package exercicio4_classe_circulo;

public class Exercicio4_classe_circulo {

    public static void main(String[] args) {
    circulo c = new circulo();
        c.raio = 5d; //5 d = 5 double; 
        c.calcularArea();
        c.calcularPerimetro();
        System.out.println(c.dados()); //ele pega a string do return e impreme ela
        c.imprimirArea();
        c.imprimirPerimetro();
    }
    
}

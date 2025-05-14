
package exemplosobreescrita1;

public class Graduacao{

    public static void main(String[] args) {
    }
    //declaração
    public double SalProfessor;
    public int matricula;
    public String nome;
    public double SalBruto;
            //metodo da classe
    public void CalculaSalario(){
        this.SalProfessor = this.SalBruto - (this.SalBruto *0.2);
       }
}

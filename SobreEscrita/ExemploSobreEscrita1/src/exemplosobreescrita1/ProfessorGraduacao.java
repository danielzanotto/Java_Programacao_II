
package exemplosobreescrita1;

public class ProfessorGraduacao extends Graduacao {
    public double qtdeDisc;
   //metodo da classe sendo sobreescrita
    //quer dizer, mater a assinatura do metodo (nome e parametro)
    //reescrever o conteudo;
    @Override 
//Override sobreescreve / substitui
    public void CalculaSalario(){
        super.SalProfessor += this.qtdeDisc *50;
    }
}
//Sobreescrita, utilização de metodos com aplicações diferentes de acordo com a classe na qual ele está sendo utilizado.
//criação de metodo: 
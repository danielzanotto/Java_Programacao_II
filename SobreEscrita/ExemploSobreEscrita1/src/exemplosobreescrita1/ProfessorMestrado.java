
package exemplosobreescrita1;

public class ProfessorMestrado extends Graduacao {
    public String anoTermDoc;
    public double qtdeArtigos;
    //metodo da classe sendo sobreescrita
    //quer dizer, mater a assinatura do metodo (nome e parametro)
    //reescrever o conteudo;
    @Override
    public void CalculaSalario(){ //obs: this. -> classe local, classe atua.
        this.SalProfessor +=this.qtdeArtigos *150;
    }
}
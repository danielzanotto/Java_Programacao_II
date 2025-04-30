
package atividadesobrecarga;
public class Pessoa{
	private int rg;
	private String nome;

	public Pessoa(){
	}

	public Pessoa(String nome){
		this.nome= nome;
	}

	public Pessoa(int rg, String nome){
		this.rg = rg;
		this.nome = nome;
	}
}
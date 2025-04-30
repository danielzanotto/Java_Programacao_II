//Esse codigo utilizou os conceitos inciaiis de Polimorfismo.
package exemplopolimorfismo1;
import javax.swing.JOptionPane;
public class ExemploPolimorfismo1 {

    public static void main(String[] args) {

    FolhaPagto folha = new FolhaPagto(140,1320,80);
    JOptionPane.showMessageDialog(null,folha.CalculaFolha("74ABF23-J")); // caso ele não encontre o funcionario ele executara a segunda função;
    }
}

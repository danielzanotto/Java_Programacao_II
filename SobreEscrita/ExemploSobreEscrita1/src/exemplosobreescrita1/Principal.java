
package exemplosobreescrita1;

import javax.swing.JOptionPane;

public class Principal {
public static void main (String [] args){
    ProfessorGraduacao profGrad = new ProfessorGraduacao();
    ProfessorMestrado profMes = new ProfessorMestrado();
    
    String aux;
    profGrad.matricula = 1257835;
    profGrad.nome= "Professor de graduação";
    profGrad.qtdeDisc = 20;
    profGrad.SalBruto = 3200;
    profGrad.CalculaSalario();
    //preparando a impressao para o prof. de graduacao
    aux = "\nDados Professor graduação \n";
    aux+="Matricula: "+ profGrad.matricula +"\n";
    aux+="Nome prof: "+ profGrad.nome +"\n";
    aux+= "Quantidade de Disc.: "+profGrad.nome +"\n";
    aux+= "Sal. Prof: R$ " + profGrad.SalProfessor+"\n";
    
    profMes.matricula = 98765;
    profMes.nome = "Professor de Mestrado";
    profMes.anoTermDoc ="2 anos";
    profMes.qtdeArtigos = 15;
    profMes.SalBruto = 4200;
    profMes.CalculaSalario();
    
    //preparando a impressao para o prof. de Mestrado
    aux += "\nDados Professor Mestrado \n";
    aux+="Matricula: "+ profMes.matricula +"\n";
    aux+="Nome prof: "+ profMes.nome +"\n";
    aux+= "Quantidade de Artigos.: "+profMes.qtdeArtigos +"\n";
    aux+="Term. Docto: "+profMes.anoTermDoc+"\n";
    aux+= "Sal. Prof: R$ " + profMes.SalProfessor+"\n";
    //impressao
    JOptionPane.showMessageDialog(null,aux);
    }
}


package exempolimorfismo2;

import javax.swing.JOptionPane;

public class PolimorfismoSobrecarga {

    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.Cpf = JOptionPane.showInputDialog("Digite o CPF");
        func.NivelEmp = JOptionPane.showInputDialog("Digite nivel empresarial"+"ou ano de admissão");
        
        func.NivelEmp = func.NivelEmp.trim().toUpperCase();//toUupperCase Caixa alta
        
        String aux ="\nCalculo do PL\n";
        if("OURO^PRATA^BRONZE".contains(func.NivelEmp)){//se contem bronze prata ou ouro,
            aux += "Funcionario: " +func.Cpf + "\n";
            aux += "Valor PL: R$"+ func.CalculaPL(1320)+"\n";
            aux += "Nivel emp.:" + func.NivelEmp + "\n";
            
        }else{
            aux += "Funcionario: " +func.Cpf + "\n";
            aux += "Valor PL: R$"+ func.CalculaPL(1320,func.NivelEmp)+"\n";
            aux += "Nivel emp.:" + func.NivelEmp + "\n";
        }
        JOptionPane.showMessageDialog(null, aux);
    }
}
//SOBRECARGA:
//SOBREESCRITA:
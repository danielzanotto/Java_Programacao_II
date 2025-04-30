
package exempolimorfismo2;

public class Funcionario {
    public String Cpf;
    public String NivelEmp;
    
    //sobrecarga utilização de mais de um metodo, de acordo com a necessidade solicitada
    public String DescobreNivelEmpresarial(int ano){
        int anoAtual = 2025;
        int qtAnos = anoAtual - ano;
        
        if (qtAnos <5){
          this.NivelEmp = "BRONZE";
        } else if (qtAnos >= 5 && qtAnos <= 15){
          this.NivelEmp = "PRATA";
        }else{
         this.NivelEmp ="OURO";       
        }
        return this.NivelEmp;
    }
//os metodos são iguais mais necessita de mais de um argumento para ser executados.
    public double CalculaPL(double SalBruto){
    //trim inibe o espaco pois não existe argumento, avaliando antes ou depois.  se tivesse colocado (batata) ele verificaria se existe batata antes ou depois da palavra;    
    switch (this.NivelEmp.trim()){//escola para ser testado utilizando. Alternativas ordenadas de processos
            case "OURO":
                return (SalBruto*5);
            case "PRATA":
                return (SalBruto*3);
            case "BRONZE":
                return (SalBruto*2);
            default:
                return 0;
    }
}
//aplicacao sobrecarga
public double CalculaPL(double SalBruto, String anoAdmissao){
    
    this.NivelEmp = DescobreNivelEmpresarial(Integer.parseInt(anoAdmissao));
    
    switch (this.NivelEmp){
    case "OURO":
        return (SalBruto *5);
    case "PRATA":
        return(SalBruto*3);
    case "BRONZE":
        return (SalBruto *2);
    default:
        break;
    }
    return 0;
}
}

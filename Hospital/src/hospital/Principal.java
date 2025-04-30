
package hospital;
public class Principal { //Classe principal.
       public static void main(String[] args) {
       Hospital hospital = new Hospital(); //cria um objeto com as propriedades do Hospital
       hospital.atenderPaciente("Carlos"); // invoca o metodo adicionando já a primeira pessoa
       hospital.atenderPaciente("Ana", "Ortopedia"); // adiciona a primeira pessa e o medico
       hospital.atenderPaciente("João", true); // indica a pessoa e se é emergencia ou não
   }
}

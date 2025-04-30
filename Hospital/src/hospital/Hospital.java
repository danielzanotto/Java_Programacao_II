
package hospital; //Pasta local

public class Hospital { 
   // Atender paciente apenas com nome
   public void atenderPaciente(String nome) { //Construtor da classe +primeiro paciente
       System.out.println("Atendendo o paciente: " + nome);
   }
   // Atender paciente com nome e tipo de consulta
   public void atenderPaciente(String nome, String tipoConsulta) { //Aplicação sobrecarga: Com o professor.
       System.out.println("Atendendo " + nome + " para uma consulta de: " + tipoConsulta);
   }
   // Atender paciente com nome e prioridade
   public void atenderPaciente(String nome, boolean emergencia) { //Aplicação sobrecarga: No caso de emergencia
       if (emergencia) {
           System.out.println("Atendimento de emergência para: " + nome);
       } else {
           System.out.println("Atendimento agendado para: " + nome);
       }
   }
}
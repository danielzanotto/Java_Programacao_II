
package calculaseprimo;
import java.util.Random;
import javax.swing.JOptionPane;

public class Principal {
        public static void main(String[] args) {
            CalcularPrimoAntecessor calcA = new CalcularPrimoAntecessor();
            CalcularPrimoSucessor calcS = new CalcularPrimoSucessor();
            Random rand = new Random();
            int nro = rand.nextInt(1000);
            String aux ="";
            
            aux= "Nro sorteado: "+ nro +"\n";
            aux+= calcA.CalculaSePrimo(nro)+"\n";
            aux+=calcS.CalculaSePrimo(nro)+"\n";
            JOptionPane.showMessageDialog(null, aux);
        }
}

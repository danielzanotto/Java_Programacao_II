
package exemploconstrutortres;

public class Honda extends Carro{
    private String motor;
    public Honda(){//construtor = função =procedimento metodos, sem parametros.
        
    }
    public Honda(String motor, String modelo, double preco){//construtor = função = procedimento com parametros em c retornam o metodo.
            super(modelo,preco);
            this.motor = motor;
    }
}
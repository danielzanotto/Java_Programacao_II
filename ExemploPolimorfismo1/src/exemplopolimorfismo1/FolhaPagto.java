package exemplopolimorfismo1;
public class FolhaPagto {
    //Declarando os atributos da classe
    private double NHTrab;
    private double SalMinimo;
    private double NHExtras;
    
    public FolhaPagto(){ //Construtor da classe
        
    }
    //Aplicação sobrecarga:
     public FolhaPagto(double NHTrab, double SalMinimo, double NHExtras){//argumentos ´la´dentro -> ()
         this.NHExtras = NHExtras;
         this.SalMinimo = SalMinimo;
         this.NHExtras = NHExtras;
     }
     //metodo de classe
     public String CalculaFolha(){ //-> metodos sem argumentos.
         String aux = "\nFolha de Pagto\n\n";
         double VHTrab = this.SalMinimo/48; //Horas trabalhadas 48 horas.
         double VHExtra = this.SalMinimo/40;
         double SalBruto = (VHTrab* this.NHTrab);
         double QuantiaHExtras = (VHExtra * this.NHExtras);
         double SalReceber = (SalBruto + QuantiaHExtras);
         
         //alt + zoom
         //+= Atribuição composta.
         //variavel auxiliar que retorna todo o valor dentro. Acumulando.
         //Metodo com argumento devido o funcionario.
         aux +="Hora Trabalhada R$ "+VHTrab+"\n";
         aux +="Hora Trabalhada R$ "+VHExtra +"\n";
         aux +="Sal Bruto R$ "+ SalBruto+"\n";
         aux +="Quantia a receber HE R$ "+QuantiaHExtras+"\n";
         aux +="Salario a receber R$ "+SalReceber+"\n";
         return aux;
     }
          public String CalculaFolha( String CodigoFunc){ //-> metodos com argumentos.
         String aux = "Funcionario não encontrado!";
         if (CodigoFunc.equals("74ABF23-J")){
         aux ="\nFOlha de Pagto\n\n";
         
         double VHTrab = this.SalMinimo/48; //Horas trabalhadas 48 horas.
         double VHExtra = this.SalMinimo/40;
         double SalBruto = (VHTrab* this.NHTrab);
         double QuantiaHExtras = (VHExtra * this.NHExtras);
         double SalReceber = (SalBruto + QuantiaHExtras);
         
         //alt + zoom
         //+= Atribuição composta.
         //variavel auxiliar que retorna todo o valor dentro. Acumulando.
         //Metodo com argumento devido o funcionario.
         aux +="Hora Trabalhada R$ "+VHTrab+"\n";
         aux +="Hora Trabalhada R$ "+VHExtra +"\n";
         aux +="Sal Bruto R$ "+ SalBruto+"\n";
         aux +="Quantia a receber HE R$ "+QuantiaHExtras+"\n";
         aux +="Salario a receber R$ "+SalReceber+"\n";
         
     }
         return aux;
}
public double getNHTrab(){
    return NHTrab;
}
public void setNHTrab(double NHTrab){
    this.NHTrab = NHTrab;
}
public double getSalMinimo(){
    return SalMinimo;
}
public void setSalMinimo(double SalMinimo){
    this.SalMinimo = SalMinimo;
}
public double getNHExtras(){
    return NHExtras;
}
public void setNHExtras(double NHExtras){
    this.NHExtras = NHExtras;
}
}
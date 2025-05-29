//este programa tem como intuito fazer a integração de um projeto java + um banco de dados
//Desenvolvendo as operaçãos CRUD: Creat, Read,Update,Delete.
package Banco_de_dados;
import CRUD.Cadastro;//ANTIGO ADO -> * Vamos desenvolver ainda.*
import java.awt.List;//Lista de ArraysList
import java.sql.Connection;//bibliotecca de conexão com BD 
import java.sql.DriverManager;//tipo de conexão com o banco que vc vai usar 
import java.sql.PreparedStatement;//objeto que executa a transção no BD 
import java.sql.ResultSet;//tudo que o banco retorna(tabela) 
import java.sql.SQLException;//exceções do bd 
import java.util.ArrayList;//para criar uma lista 

//Desenvolvedores: Daniel Zanotto Aracena e Aguida Mizael 
public class BancoDados { 
  private Connection conn; //Atributo para o ojeto da classe 
  public boolean status = false;//atributo para objeto da classe 
  //construtor da classe 
  public BancoDados(){ 
    this.conn = null;//atributo sendo inicializado(garantindo que esta vazio) 
    } //metodo de conexao com o banco de dados 
  public void ConectarBancoDados() {
    try{ //Carregando o JDBC Driver padrão 
      String driverName ="com.mysql.jdbc.Driver"; //a conexão do Driver 
      Class.forName(driverName);//reconhecer o drive que tem na maquina 
      //Configurando a nossa conexão com um banco de dados// 
      String serverName = "localhost"; //caminho do servidor do BD 
      String mydatabase ="fatec";//nome do seu banco de dados 
      String url ="jdbc:mysql://"+serverName+"/"+mydatabase; String username ="root"; //nome de um usuário de seu BD (OBbs: root represnetea em branco a senha do my sql) 
      String password ="";//sua senha de acesso 
      this.conn = DriverManager.getConnection(url,username,password);//aqui que a conexão acontece 
      //Desativar o auto-commit para iniciar a transação 
      //Desativar o commit, para ele não alterar de forma automática, "eu que quero ter o controle" 
      this.conn.setAutoCommit(false);//se ativado altera instantaneamente o banco de dados 
      
      //Testa sua conexão//
      if (this.conn !=null){//é pq esta conectado 
        this.status = true; 
      }else{ 
        this.status = false; 
      } 
    } catch(ClassNotFoundException e){//Driver não encontrado 
      System.out.println("O driver especificado nao foi encontrado"); 
    }catch(SQLException e){ //Não conseguindo se conectar ao banco 
      System.out.println("Não foi possivel conectar ao Bnaco de Dados"); //Talvez precise do xampp (Geerenciador de banco de dados) 
    } 
  } //Método que fecha sua transação// 
  public boolean FecharTransacao(){ //faço a teansação assim que terminar preciso fechar a transação 
    //Deve sempre fechar a transação por que se não a expressão não será finalizada, seria impossivel fazer delete ou insert 
    try{
      this.conn.close(); 
      return true; 
    
    } catch (SQLException e){
      System.out.println("Erro ao fechar o Banco de Dados!"); 
      //já fechei e estou tentando fechar novamente 
      return false;
    }
  } //Método Update 
  public boolean TransacaoSQL(String sql){//todos vão passar por este metodo (update,delete,insert) 
    PreparedStatement stmt;//criando o objeto stmt 
    /*PreparedStatement: permite enviar vários comandos SQL como um grupo único para um banco de dados por meio do uso do suporte de lote porque processar um grupo de operações é tipicamente mais rápida do que processá-los um de cada vez */ 
    try{
      if(this.conn !=null){
        stmt = this.conn.prepareStatement(sql);//ou update, ou delete ou insert 
        stmt.executeUpdate();//é o metodo do objeto stmt do proprio java 
        this.conn.commit();//altera/gravar 
        
        return true;
      }
    }catch(SQLException ex){
      System.out.println("Erro na transação:"+ ex.getMessage());
      return false;
    } 
    return false; 
  } 
  public ArrayList<Cadastro>SelectDados(String sql){
    ResultSet rs;
    PreparedStatement stmt;
    ArrayList<Cadastro> ListaRegristro = new ArrayList<>();//por ser lista ele é diferente ao criar um novo modelo sendo <> um indicador
    try{
      if(this.conn !=null){
        stmt=this.conn.prepareStatement(sql);//montar a querry 
        rs = stmt.executeQuery();//rs é um objeto da resultSet 
        
          while (rs.next()){//le linha por linha Cadastro 
            cad = new Cadastro(); cad.id = rs.getInt("Id"); // retorna do banco de dados e traz para os atributos 
            cad.nome = rs.getString("nome");
            cad.cpf = rs.getString("cpf");
            cad.dataNasc = rs.getString("dataNasc");
            cad.email = rs.getString("email");
            cad.celular = rs.getString("celular");
            cad.endereco = rs.getString("Endereco");
            cad.uf = rs.getString("uf");
            ListaRegistro.add(cad);//ainda não foi criada nessa versão
          }
      }
    }
    catch(SQLException ex){
      System.out.println("Erro na leitura"+ex.getMessage()); 
    }
    finally{
      FecharTransacao();
    }
    return ListaRegistro;ainda não foi criada nessa versão
  }
}
//Observações: Os programas a seguir serão necessários para o desenvolvimento da integração e ffuncionamento do programa
//WampServer64 E Work Ban //Xampp (APACH e MySqL) e WORKBENCH, No banco de dados vamos ter que criar: creat database fatec; * Create table Cadastro e suas variaveis e classes;

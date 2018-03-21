package br.com.exemploJdbc.testeJdbc;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.exemploJdbc.connection.ConnectionManager;

/**
 * Hello world!
 *
 */
public class App 
{
	// MSSQL Server
    //static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
    //static final String DB_URL = "jdbc:sqlserver://localhost:1433;DatabaseName=JavaTeste";
    
    // Oracle Server
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";

    //  Database credentials
    static final String USER = "teste";
    static final String PASS = "teste";
	   
    public static void main( String[] args ) throws SQLException
    {
       Connection conn = null;
	   Statement stmt = null;
	   try{
		   
		   System.out.println("Início testeJdbc");
	      
	      //STEP 3: Open a connection
	      conn = ConnectionManager.getConnection(JDBC_DRIVER, DB_URL, USER, PASS);

	      //STEP 4: Execute a query
	      stmt = conn.createStatement();
	      String sql;
	      sql = "SELECT * FROM TESTE";
	      ResultSet rs = stmt.executeQuery(sql);

	      //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         int id  = rs.getInt("ID");
	         String descricao = rs.getString("DESCRICAO");

	         //Display values
	         System.out.print("ID: " + id);
	         System.out.println(", Descrição: " + descricao);
	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Fim testeJdbc");
    }
}

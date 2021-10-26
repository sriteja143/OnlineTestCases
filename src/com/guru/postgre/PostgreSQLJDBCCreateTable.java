package com.guru.postgre;
import java.sql.*;


public class PostgreSQLJDBCCreateTable {
   public static void main( String args[] ) {
      Connection c = null;
      Statement stmt = null;
      try {
    	  System.out.println("trying Opened database");
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/test",
            "postgres", "test");
         System.out.println("Opened database successfully");

         
         String sql = "SELECT * FROM COMPANY where name='tja';";
         stmt = c.createStatement();
         
         ResultSet rs = stmt.executeQuery(sql);
         if(rs.next()) {
        	 System.out.println("rs.next()");
         }else {
        	 System.out.println("else");
         }
        
         stmt.close();
         c.close();
      } catch ( Exception e ) {
    	  e.printStackTrace();
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
         try {
			c.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
      }
      System.out.println("Table created successfully");
   }
}
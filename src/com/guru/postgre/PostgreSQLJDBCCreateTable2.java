package com.guru.postgre;
import java.sql.*;


public class PostgreSQLJDBCCreateTable2 {
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

         stmt = c.createStatement();
         String sql = "CREATE TABLE COMPANY " +
            "(ID INT PRIMARY KEY     NOT NULL," +
            " NAME           TEXT    NOT NULL, " +
            " AGE            INT     NOT NULL, " +
            " ADDRESS        CHAR(50), " +
            " SALARY         REAL)";
        System.out.println( stmt.executeUpdate(sql));;
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
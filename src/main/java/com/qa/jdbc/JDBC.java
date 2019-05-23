package com.qa.jdbc;

import java.sql.*;

public class JDBC {
	
	
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  

   private static String DB_URL = "jdbc:mysql://localhost:3306/";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "password";
   
   public String getDriver()
   {
	   return this.JDBC_DRIVER;
   }
   public String getURL()
   {
	   return this.DB_URL;
   }
   public String getUser()
   {
	   return this.USER;
   }
   public String getPass()
   {
	   return this.PASS;
   }
   
   
   public void setURL(String URL)
   {
	   System.out.println(DB_URL);
	   this.DB_URL = URL;
	   System.out.println(DB_URL);
   }
}
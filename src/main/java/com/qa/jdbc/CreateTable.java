package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	
	public void CreateTab(String dbName, String name) throws SQLException{
		
	JDBC j = new JDBC();
	CreateDb c = new CreateDb();
	c.URL(dbName);
	System.out.println(j.getURL());
	
	 Connection conn = null;

     System.out.println("Connecting to database...");
	conn = DriverManager.getConnection(j.getURL(),j.getUser(),j.getPass());
		
		Statement stmt = conn.createStatement();
		
		String sql = "create table " + name;
		System.out.println(sql);
		stmt.execute(sql);
		
		
     conn.close();
	}

}

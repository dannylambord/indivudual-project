package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDb {
	
	
	public void create(String name) throws SQLException
	{
		JDBC j = new JDBC();
		defURL();
		Connection conn = null;

	      System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(j.getURL(),j.getUser(),j.getPass());
			
			Statement stmt = conn.createStatement();
			
			String sql = "create database " + name;
			stmt.execute(sql);
			URL(name);
			
	      conn.close();
	}
	
	
	public void defURL()
	{
		JDBC j = new JDBC();
		j.setURL("jdbc:mysql://localhost:3306/");
	}
	
	public void URL(String name)
	{
		JDBC j = new JDBC();
		System.out.println("Running");
		j.setURL("jdbc:mysql://localhost:3306/" + name);
	}

}

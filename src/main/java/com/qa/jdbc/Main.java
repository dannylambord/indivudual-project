package com.qa.jdbc;

import java.sql.SQLException;

public class Main {
	
	
	public static void main(String[] args)
	{
		CreateTable c = new CreateTable();
		try {
			c.CreateTab("testy", "test2(name1 Varchar(5));");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
		String url = "jdbc:mysql://185.201.11.181:3306/u361289749_trabalho";
		
		Connection conn = null;
		
		try{
			conn = DriverManager.getConnection(url, "u361289749_trabalho", "Abc123456");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		if(conn == null)
			System.out.println("Falha na conexão!");
		else
			System.out.println("Success na conexão!");
		
		return conn;
	}

}

package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.ConnectionFactory;

public class Main {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();

		try (PreparedStatement ps = connection.prepareStatement("INSERT INTO cliente(nome, telefone, email) VALUES (?,?,?)")) {

			ps.setString(1, "Lucas");
			ps.setString(2, "997699921");
			ps.setString(3, "lucasss.code@gmail.com");
			
			//ps.execute();
			
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM cliente");
			
			while(rs.next()) {
				System.out.printf("%s %s %s \n", rs.getString("nome"), rs.getString("telefone"), rs.getString("email"));
			}
			
			rs.close();
			st.close();
			
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

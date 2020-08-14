package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	String urlConexao = "jdbc:mysql://185.201.11.181:3306";
	String usuario = "u361289749_trabalho";
	String senha = "@L";
	String schema = "u361289749_trabalho";
	Connection connection;

	public Connection getConnection() {

		System.out.println("Conectando ao banco");

		try {
//			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(urlConexao+"/"+schema, usuario, senha);

			if (connection != null) {
				System.out.println("Conectado ao banco");
			} else {
				System.out.println("N�o foi poss�vel conectar");
			}
			return connection;

		}

//		catch (ClassNotFoundException e) {
//			System.out.println("Driver n�o encontrado");
//			return null;
//		}

		catch (SQLException e) {
			System.out.println("N�o foi poss�vel conectar");
			return null;
		}
	}

}

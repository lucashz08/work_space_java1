package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.classes.Carros;
import com.model.ConnectionFactory;

public class CarrosDao {

	public int inserirCarro(Carros car) {

		int codigo = 0;

		try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(
				"INSERT INTO carros(codigo, modelo, marca) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {

			ps.setString(1, null);
			ps.setString(2, car.getModelo());
			ps.setString(3, car.getMarca());

			int rows = ps.executeUpdate();

			if (rows != 0) {

				ResultSet rss = ps.getGeneratedKeys();

				if (rss.next()) {
					System.out.printf("inseriodo retorno codigo : %d", rss.getInt(1));
					codigo = rss.getInt(1);
					car.setId(codigo);
				}
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return codigo;
	}

	public Carros selectCarro(int codigo) {

		Carros car = new Carros();

		try (PreparedStatement ps = ConnectionFactory.getConnection()
				.prepareStatement("SELECT * FROM carros where codigo = ?")) {
			
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				car.setMarca(rs.getString("marca"));
				car.setModelo(rs.getString("modelo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return car;
	}

	public int updateCarro(Carros car) {

		int rows = 0;

		Carros old = selectCarro(car.getId());

		if (car.getMarca() == null) {
			car.setMarca(old.getMarca());
		}

		if (car.getModelo() == null) {
			car.setModelo(old.getMarca());
		}

		try (PreparedStatement ps = ConnectionFactory.getConnection()
				.prepareStatement("UPDATE carros SET modelo = ?, marca = ? WHERE codigo = ?")) {

			ps.setString(1, car.getModelo());
			ps.setString(2, car.getMarca());
			ps.setInt(3, car.getId());

			rows = ps.executeUpdate();

			System.out.println("Total de linhas afetadas : " + rows);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rows;
	}
	
	public int deleteCarro(Carros car) {
		
		try(PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement("DELETE FROM carros WHERE id = ?")){
			ps.setInt(1, car.getId());
			ps.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
}

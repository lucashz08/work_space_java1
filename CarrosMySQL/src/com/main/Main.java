package com.main;

import com.classes.Carros;

public class Main {

	public static void main(String[] args) {
		
	//	Connection conn = ConnectionFactory.getConnection();
		
		Carros car = new Carros(3);
		
		//car.setId(3);
//		car.setMarca("chev");
//		car.setModelo("Celta");
//		car.inserirCarro();
//		
//		car.setModelo("Gol");
//		car.updateCarro();
		System.out.print(car);

	}

}

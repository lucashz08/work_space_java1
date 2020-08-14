package com.depositcode;

public class testeHeranca {

	public static void main(String[] args) {
		
		Moto moto = new Moto();
		moto.setPlaca("TTT-0000");
		moto.run();
		
		Carro carro = new Carro();
		carro.setPlaca("AAA-8474");
		carro.run();
		
		System.out.println(moto);
		System.out.println(carro);
	}

}

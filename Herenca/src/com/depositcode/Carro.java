package com.depositcode;

public class Carro extends Veiculo{
	
	private int qtdRodas;
	
	public Carro() {
		super();
		this.qtdRodas = 4;
	}

	public void run()
	{
		System.out.println("Anda com quatro rodas");
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	
	public String toString() {
		return "Carro [qtdRodas=" + 
				qtdRodas + ", "
			+ "placa="+super.getPlaca()+"]";
	}
}

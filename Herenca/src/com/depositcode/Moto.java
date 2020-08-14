package com.depositcode;

public class Moto extends Veiculo{
	
	private int qtdRodas;
	
	public Moto() {
		super();
		this.qtdRodas = 2;
	}

	public void run()
	{
		System.out.println("Anda com duas rodas");
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	@Override
	public String toString() {
		return "Moto [qtdRodas=" + qtdRodas + ", placa="+super.getPlaca()+"]";
	}

}

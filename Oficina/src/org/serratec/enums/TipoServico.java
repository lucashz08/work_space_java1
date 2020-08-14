package org.serratec.enums;

public enum TipoServico {
	
	OLEO(100),
	LAVAGEM(50),
	REVISAO(200);

	private final double valor;
	
	private TipoServico(double valor) {
		this.valor = valor;

	}

	public double getValor() {
		return valor;
	}

}

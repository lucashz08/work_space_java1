package com.group.enums;

public enum PessoaEnum {
	NOTHING(-1),
	FALSE(0),
	TRUE(1);

	private int valor;
	
	PessoaEnum(int i) {
		this.valor = i;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}

package com.main;

public abstract class Conta {

	private String nome;
	private String telefone;
	private String email;
	
	
	public Conta() {
		super();
	}

	public Conta(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract int insertConta();
	public abstract int updateConta();
	public abstract int delateConta();
	public abstract void selectConta();
	
}

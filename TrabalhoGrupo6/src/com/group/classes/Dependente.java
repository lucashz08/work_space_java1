package com.group.classes;

import java.time.LocalDate;

import com.group.exceptions.DependenteException;

public class Dependente extends Pessoa {

	private String parentesco;

	public Dependente(String nome, String cpf, LocalDate dataNascimento, String parente) {
		super(nome, cpf, dataNascimento);
		this.parentesco = parente;
	}

	public String getParentesco() {
		return parentesco;
	}

	@Override
	public String toString() {
		return "\nDependente [parentesco=" + parentesco + " " + super.toString() + "]";
	}

	/**
	 * @deprecated metodo so pode ser usado pela classe funcionario
	 */
	@Deprecated
	@Override
	public void addDependete(Dependente dep) throws DependenteException {
		// TODO Auto-generated method stub

	}

	/**
	 * @deprecated metodo so pode ser usado pela classe funcionario
	 */
	@Deprecated
	@Override
	public void addDependete(String nome, String cpf, LocalDate dataNascimento, String parente)
			throws DependenteException {

	}

}

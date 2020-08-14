package org.serratec.classes;

import java.time.LocalDate;

import org.serratec.interfaces.Oficina;

public abstract class Veiculo implements Oficina {

	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	
	public Proprietario getProprietario() {
		return proprietario;
	}
	
	public double getValorCobrado() {
		return valorCobrado;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto
				+ ", proprietario=" + proprietario + "]";
	}

}

package org.serratec.classes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import org.serratec.enums.TipoServico;

public class Carro extends Veiculo {
	
	private String categoria;
	
	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}
		
	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavar() {
		
		double cobrado = TipoServico.LAVAGEM.getValor();
		
		if(super.dataConserto.getMonth().equals(Month.AUGUST))
		{
			cobrado = cobrado - (cobrado * 0.1);

		}
		
		super.valorCobrado += cobrado;
		
		return cobrado;
	}

	@Override
	public double trocarOleo() {
		double desconto = 0;
		
		if(super.dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY))
		{
			desconto = 50.00;
		}
		
		super.valorCobrado += TipoServico.OLEO.getValor() - desconto;
		
		return TipoServico.OLEO.getValor() - desconto;
	}

	@Override
	public double revisao() {
		
		super.valorCobrado += TipoServico.REVISAO.getValor();
		return TipoServico.REVISAO.getValor();
	}

}

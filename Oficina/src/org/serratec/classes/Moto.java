package org.serratec.classes;

import java.time.LocalDate;

import org.serratec.enums.TipoServico;

public class Moto extends Veiculo {

	private int cilindrada;
	
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindrada) {
		super(modelo, dataConserto, proprietario);
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public double lavar() {
		
		super.valorCobrado += TipoServico.LAVAGEM.getValor();
		
		return (double)TipoServico.LAVAGEM.getValor();
	}

	@Override
	public double trocarOleo() {
		
		super.valorCobrado += TipoServico.OLEO.getValor();
		
		return TipoServico.OLEO.getValor();
	}

	@Override
	public double revisao() {
		
		super.valorCobrado += TipoServico.REVISAO.getValor();
		
		return TipoServico.REVISAO.getValor();
	}

}

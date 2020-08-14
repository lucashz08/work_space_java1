package recapitulando;

public class Propretario {
	private String nome;
	Imovel imovel;
	
	public Propretario(String nome, Imovel imovel) {
		super();
		this.nome = nome;
		this.imovel = imovel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	
	
	
}

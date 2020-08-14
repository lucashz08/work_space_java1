package recapitulando;

public abstract class Imovel {
	protected String local;
	private double valorImovel;
	
	public Imovel(String local, double valorImovel) {
		super();
		this.local = local;
		this.valorImovel = valorImovel;
	}
	
	public double calculaImposto()
	{
		return this.valorImovel - (this.valorImovel * 0.035);
	}
	
	public abstract boolean isGaragem();
	
	@Override
	public String toString() {
		return "Imovel [local=" + local + ", valorImovel=" + valorImovel + "]";
	}
	
	
}

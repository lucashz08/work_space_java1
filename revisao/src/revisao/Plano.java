package revisao;

public class Plano {
	
	protected String empresa;
	protected final double valorPago = 80;
	protected final double valorIss = 5;
	
	public Plano(String empresa)
	{
		this.empresa = empresa;
	}

	public double calcularPagamento()
	{
		
		return valorPago - (valorPago * valorIss / 100);
	}
	
	public double getValorPago()
	{
		return valorPago;
	}

	@Override
	public String toString() {
		return "Plano [empresa=" + empresa + ", valorPago=" + valorPago + ", valorIss=" + valorIss + "]";
	}
	
}

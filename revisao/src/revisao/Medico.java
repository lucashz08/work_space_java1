package revisao;

public class Medico extends Plano {

	protected String nome;
	private int crm;
	
	public Medico(String empresa, String nome, int crm)
	{
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	
	public double calcularPagamento()
	{
		
		return super.valorPago + (super.valorPago * 0.1);
	}

	public String getNome() {
		return nome;
	}

	public int getCrm() {
		return crm;
	}

	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", crm=" + crm + " ] \n "+ super.toString();
	}

	


	
	
}

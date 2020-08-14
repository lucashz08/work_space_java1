package revisao;

public class Anestesista extends Medico{
	
	private String tipoAnestesia;
	
	public Anestesista(String empresa, String nome, int crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}
	
	public double calcularPagamento()
	{
		return super.calcularPagamento() + 1000.00;
	}
	
	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public String toString() {
		return "Anestesista [tipoAnestesia=" + tipoAnestesia + "] \n "+ super.toString();
	}


	
	
}

package aula;

public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void abonoSalario()
	{
		this.salario += this.salario * 0.1;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}
	
}

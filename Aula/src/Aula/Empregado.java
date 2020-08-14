package Aula;

import java.time.LocalDate;

public class Empregado {
	private String nome;
	private String sobrenome;
	private float salario;
	private LocalDate data;
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Empregado(String nome, String sobrenome, float salario)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	public float calculaImpostoRenda()
	{
		float salary;
		if(this.salario < 1903.98)
		{
			salary = this.salario;
		}
		else if(this.salario < 2826.65)
		{
			salary =  (float) (this.salario - (this.salario * 0.07f));
		}
		else if(this.salario < 4664.68)
		{
			salary =  (float) (this.salario - (this.salario * 0.15f));
		}
		else
			salary =  (float) (this.salario - (this.salario * 0.225));
		
		
			
		return salary;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", sobrenome=" + sobrenome + ", salario=" + salario + ", data=" + data + "]";
	}


	
}

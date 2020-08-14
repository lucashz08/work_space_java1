package aula;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] funcionario = {new Funcionario("Lucas", "Developer", 1.00),
									 new Funcionario("Bil", "Empresario", 100000.00)};
		
		
		for(Funcionario fnc: funcionario )
		{
			fnc.abonoSalario();
			System.out.println("Nome : "+ fnc.getNome() + ", Cargo : "+fnc.getCargo()+ ", Salario : "+ String.format("%.2f", fnc.getSalario()));
		}

	}

}

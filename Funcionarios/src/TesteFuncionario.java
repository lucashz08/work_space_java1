import java.time.LocalDate;

public class TesteFuncionario {

	public static void main(String[] args) {
	
		FuncionarioPublico funcionario = new FuncionarioPublico(LocalDate.parse("2003-08-03"));
		System.out.print(funcionario);

	}

}

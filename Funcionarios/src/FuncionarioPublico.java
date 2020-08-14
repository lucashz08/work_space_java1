import java.time.LocalDate;

public class FuncionarioPublico {
	
	final private LocalDate anoConcurso;
	
	public FuncionarioPublico(LocalDate data)
	{
		this.anoConcurso = data;
	}

	@Override
	public String toString() {
		return "FuncionarioPublico [data=" + this.anoConcurso.getYear() + "]";
	}
	
}

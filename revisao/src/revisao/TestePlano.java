package revisao;

public class TestePlano {

	public static void main(String[] args) {
		
		Clinica clinica = new Clinica("Unimed", "Terceira", "Seila");
		clinica.calcularPagamento();
		System.out.println(clinica.calcularPagamento());
		System.out.println(clinica);
		
		Medico medico = new Medico("Unimed", "Lucas", 7834 );
		medico.calcularPagamento();
		System.out.println(medico.calcularPagamento());
		System.out.println(medico);
		
		Anestesista anestesista = new Anestesista("Unimed", "Lucas2", 123, "seilass" );
		anestesista.calcularPagamento();
		System.out.println(anestesista.calcularPagamento());
		System.out.println(anestesista);
	}

}

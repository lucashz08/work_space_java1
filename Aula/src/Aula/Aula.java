package Aula;

import java.time.LocalDate;

public class Aula {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("Lucas", "Lopes", 2000.00f);
		Empregado empregado2 = new Empregado("Livia", "Lopes", 3000.00f);
		
		empregado.setData(LocalDate.parse("2017-06-16"));
		empregado2.setData(LocalDate.parse("2016-01-21"));
		
		System.out.println(empregado.getData().getDayOfWeek());
		
		empregado.setSalario(empregado.calculaImpostoRenda());
		empregado2.setSalario(empregado2.calculaImpostoRenda());
		
		System.out.println(empregado);
		System.out.println(empregado2);
		
	}

}

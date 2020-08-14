package com.group.classes;

import java.util.ArrayList;
import java.util.List;

public class CalcularImposto {

	public static void calcularFuncionario(Funcionario fc) {

		calcularDescontoInss(fc);
	}

	private static void calcularDescontoInss(Funcionario fc) {

		if (fc.getSalarioBruto() <= 1751.81) {

			fc.setDescontoInss(fc.getSalarioBruto() * 0.08);

		} else if (fc.getSalarioBruto() <= 2919.72) {

			fc.setDescontoInss(fc.getSalarioBruto() * 0.09);

		} else if (fc.getSalarioBruto() <= 5839.45) {

			fc.setDescontoInss(fc.getSalarioBruto() * 0.11);

		} else {
			fc.setDescontoInss(5839.45 * 0.11);
		}

		calcularValorDependente(fc);
	}

	private static void calcularValorDependente(Funcionario fc) {

		List<Dependente> dep = new ArrayList<>();
		dep = fc.getListaDependente();

		int contadorDependente = 0;

		for (int i = 0; i < dep.size(); i++) {

			contadorDependente++;

		}

		fc.setValorDependentes(contadorDependente * 189.59);

		calcularSalarioLiquido(fc);
	}

	private static void calcularSalarioLiquido(Funcionario fc) {

		calcularImpostoRenda(fc);
		
		fc.setSalarioLiquido(fc.getSalarioBruto()-fc.getDescontoInss()-fc.getDescontoIR());
	}

	private static void calcularImpostoRenda(Funcionario fc) {
		
		fc.setSalarioBaseIR(fc.getSalarioBruto()-fc.getDescontoInss()-fc.getValorDependentes());
		
		if (fc.getSalarioBaseIR() <= 1903.98) {

			fc.setDescontoIR(0);

		} else if (fc.getSalarioBaseIR() <= 2826.65) {

			fc.setDescontoIR((fc.getSalarioBaseIR() * 0.075) - 142.80);

		} else if (fc.getSalarioBaseIR() <= 3751.05) {

			fc.setDescontoIR((fc.getSalarioBaseIR() * 0.15) - 354.80);

		} else if (fc.getSalarioBaseIR() <= 4664.68) {

			fc.setDescontoIR((fc.getSalarioBaseIR() * 0.225) - 636.13);

		} else {
			fc.setDescontoIR((fc.getSalarioBaseIR() * 0.275) - 869.36);
		}
	}

}
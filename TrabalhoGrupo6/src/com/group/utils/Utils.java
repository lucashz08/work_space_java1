package com.group.utils;

public class Utils {

	/**
	 * Verifica se uma String pode ser convertida em Double
	 * 
	 * @author Lucas Lopes
	 * 
	 * @param str
	 * @return caso possivel retorna true
	 */

	public static boolean isDouble(String str) {
		try {
			Double.parseDouble(str);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * Verifica se uma String pode ser um cpf caso tenha 11 digitos e apenas numeros
	 * 
	 * @author Lucas Lopes
	 * 
	 * @param cpf
	 * 
	 * @return caso seja um cpf retorna true
	 */

	public static boolean verificarCPF(String cpf) {

		if (cpf.length() != 11) {
			return false;
		}

		if (!cpf.matches("^[0-9]*$")) {

			return false;
		}

		return true;
	}
}

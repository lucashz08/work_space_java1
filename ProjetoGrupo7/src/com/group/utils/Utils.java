package com.group.utils;

public class Utils {

	public static boolean isDouble(String str) {
		try {
			Double.parseDouble(str);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

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

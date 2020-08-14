package com.group.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.group.classes.Dependente;
import com.group.classes.Funcionario;
import com.group.classes.Pessoa;
import com.group.enums.PessoaEnum;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite o nome do arquivos de entra mais a extensão : ");

			String fileName = sc.nextLine();

			if (fileName.isEmpty())
				fileName = "entrada.csv";

			String path = new File(fileName).getAbsolutePath();

			int encontrado = Pessoa.funcionarioOrDepentendeRepeat(path);

			if (encontrado != PessoaEnum.NOTHING.getValor()) {

				System.out.println("CPF Invalido na linha : " + encontrado);

			} else {

				List<Pessoa> pessoas = new ArrayList<>();
				pessoas = Pessoa.getListByFile(path);

				for (Pessoa p : pessoas) {

					Funcionario funcionario = (Funcionario) p;

					funcionario.gerarExtratoImposto();

					System.out.println("\n====================================");
					System.out.println(funcionario);

					System.out.printf("Depedentes : ");

					for (Dependente depe : funcionario.getListaDependente()) {
						System.out.printf("[%s : %s]", depe.getNome(), depe.getParentesco());
					}

				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

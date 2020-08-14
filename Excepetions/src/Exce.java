import java.util.InputMismatchException;
import java.util.Scanner;

public class Exce {

	public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);

		try {

			numero = Sc.lerInt(sc);

			System.out.println("valor digitado foi : " + numero);

		} catch (InputMismatchException e) {
			
			System.out.println("Falha ao ler numero : " + e.getMessage());

		} finally {
			sc.close();
		}
	}
}

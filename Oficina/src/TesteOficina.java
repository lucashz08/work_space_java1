import java.time.LocalDate;

import org.serratec.classes.Carro;
import org.serratec.classes.Proprietario;
import org.serratec.classes.Veiculo;

public class TesteOficina {

	public static void main(String[] args) {
		
		Proprietario dono = new Proprietario("Lucas");
		Carro carro = new Carro("Celta", LocalDate.parse("2020-08-05"), dono, "seila");
		carro.trocarOleo();
		carro.revisao();
		
		carro.lavar(); // com desconto do mês
		
		System.out.println("Nome : "+ carro.getProprietario().getNome() + " ");
		System.out.println(carro);
		System.out.println("Valor Cobrado : R$"+ String.format("%.2f", carro.getValorCobrado()));
		
	}
}

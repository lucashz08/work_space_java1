package recapitulando;

public class TesteRecapitulando {

	public static void main(String[] args) {

		Casa casa = new Casa("Araras", 12000.02, true);

		Propretario propretario = new Propretario("Lucas", casa);
		System.out.println(propretario.getNome() + " tem uma casa de R$" + String.format("%.2f",propretario.getImovel().calculaImposto())
				+ " e essa casa " + ((propretario.getImovel().isGaragem()) ? "tem" : "nao tem") + " garagem");
	}

}

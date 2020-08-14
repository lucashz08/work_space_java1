
public class Teste {

	public static void main(String[] args) {
		
		Biblioteca bib = new Biblioteca("Lucas Lopes");
		
		bib.getLivros().add(new Livros("C++ Iniciantes", "Cara Qualquer", 145.99));
		bib.getLivros().add(new Livros("C++ Intermediario", "Cara Qualquer", 232.99));
		bib.getLivros().add(new Livros("C++ Avançado", "Cara Qualquer", 262.99));
		
		bib.getLivros().add(new Livros("Java Iniciantes", "Cara Qualquer", 343.99));
		bib.getLivros().add(new Livros("Java Intermediario", "Cara Qualquer", 435.99));
		bib.getLivros().add(new Livros("Java Avançado", "Cara Qualquer", 564.99));
		
		bib.adicionar("HTML Iniciante", "Outra pessoa", 32.99);
		System.out.println("--------------------------------------");
		System.out.println("Pesquisa");
		bib.pesquisarFaixadePreco(200, 400);
		System.out.println("--------------------------------------");
		System.out.println("Valor");
		System.out.println(bib.calcularTotalLivros());
		
		System.out.println("--------------------------------------");
		bib.listar();

	}

}

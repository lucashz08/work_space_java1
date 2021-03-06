import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private String responsavel;
	private List<Livros> livros = new ArrayList<Livros>();
	
	
	public Biblioteca(String responsavel) {
		super();
		this.responsavel = responsavel;
	}

	public String getResponsavel() {
		return responsavel;
	}
	
	public List<Livros> getLivros() {
		return livros;
	}
	
	public void adicionar(String title, String autor, double preco) {
		
		livros.add(new Livros(title, autor, preco));
		
	}
	
	public void listar() {
		
		for(Livros li : livros)
		{
			System.out.println(li);
		}
	}
	
	public int pesquisarFaixadePreco(double valorInicial, double valorFinal){
		
		List<Livros> lista = new ArrayList<>();
		
		for (Livros li : livros) {
			
			if(li.getPreco() >= valorInicial && li.getPreco() <= valorFinal) {
				lista.add(li);
			}	
		}
		
		for(Livros li : lista) {
			System.out.println(li);
		}
		
		return 0;
	}
	
	public double calcularTotalLivros() {
		double soma = 0;
		
		for (Livros li : livros) {
			soma += li.getPreco();
		}
		
		return soma;
	}
	
}

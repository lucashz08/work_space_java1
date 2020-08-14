public class Livros {
	
	private String titulo;
	private String autor;
	private double preco;
	
	public Livros(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Livros [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
	}
	
	
}

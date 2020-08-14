
public class Veiculos {
	
	private String marca;
	private String modelo;
	
	public Veiculos(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Veiculos [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
 
}

import java.util.HashMap;
import java.util.Map;

public class Teste {

	public static void main(String[] args) {
		
		Map<String, Veiculos> mapping = new HashMap<String, Veiculos>();
		
		mapping.put("Lucas", new Veiculos("Volks", "Gol"));
		mapping.put("Viviane", new Veiculos("Chev", "Celta"));
		mapping.put("Cicero", new Veiculos("Ferrari", "F 10"));
		
		System.out.println(mapping);
		System.out.println(mapping.keySet());
		
		System.out.print(mapping.get("Lucas").getMarca());

	}

}

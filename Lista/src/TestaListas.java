import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaListas {
	
	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		lista.add(new Pessoa("Lucas", "6323654", 27));
		lista.add(new Pessoa("Vivian", "6333654", 34));
		lista.add(new Pessoa("Livia", "6366654", 14));
		lista.add(new Pessoa("Larrisa", "6325554", 7));

		Collections.sort(lista);
		
		for(int i = 0; i < lista.size(); i++){

			System.out.println(lista.get(i));

		}				
	}

}

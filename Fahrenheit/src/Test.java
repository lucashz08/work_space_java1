
public class Test {
	public static void main(String[] args) {
		
		double fah = 55;
		double cel =  0;
		
		try {
			cel = Utils.toCelsius(fah);
		} catch (FahrenheitException e) {
			System.out.println(e);		
		}
		
		System.out.println("Celsion : "+ String.format("%.2f", cel));
		
	}
}

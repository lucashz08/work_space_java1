
public class Utils {
	
	
	public static double toCelsius(double fah) throws FahrenheitException
	{
		if(fah < -459.67)
			throw new FahrenheitException("Menor que 0 absoluto");
		
		return (5 * (fah - 32)) / 9;
	}
}

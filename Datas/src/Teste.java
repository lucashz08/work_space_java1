import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		
		/*
		LocalDate data = LocalDate.now();
		System.out.println(data);
		
		Period p =  Period.between(LocalDate.parse("1993-03-08"), data);
		
		System.out.println("Quantidade de dias : "+ p.getDays());

		System.out.println("Quantidade de Anos : "+ p.getYears());
		*/

		
		DateTimeFormatter f  = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate dd = LocalDate.parse("20150809", f);
		System.out.println(dd);
		
		LocalDate d = LocalDate.parse("2017-09-08");
		System.out.println(d.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
		
		/*
		String da = "19930308";
		String ano = da.substring(0, 4);
		String mes = da.substring(4,6);
		String dia = da.substring(6, 8);
		
		String newdata =  da.substring(0, 4)+ "-";
			   newdata += da.substring(4,6)+ "-";
			   newdata += da.substring(6, 8);
		
		System.out.println(LocalDate.parse(newdata));
		
		*/
		
		
	}

}

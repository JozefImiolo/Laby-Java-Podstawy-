package prog.imper.Lab4;

import java.util.ArrayList;
import java.util.List;

public class Exceptions {

	public static void main(String[] args) {
		
		int sum=0;
		try {
		for (int i = 0; i < args.length; i++) {
			sum+=Integer.parseInt(args[i]);
		}
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Z³y format danych");
			//System.exit(-1);
		}	
		catch(IndexOutOfBoundsException ex)
		{
			System.out.println("przekroczona tablica");
			//System.exit(-2);
		}
		System.out.println("Sum= "+ sum);
		
		String slowo="Ala";
		try
		{
			System.out.println(slowo.toString());
		}
		catch(NullPointerException ex)
		{
			System.out.println("wskazanie na null");
			//System.exit(-2);
		}
		List<Double> list=new ArrayList<>();
		int k=0;
		try {
		for (int i = 0; i <1000L; i++) {
			list.add(5.0);
			k=i;
		}
		}
		catch(OutOfMemoryError ex)
		{
			System.out.println("Brak pamiêci dla elemntu: " +k);
			//System.exit(-2);
			
		}
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Nie dozwolene dzia³anie arytmetyczne");
			ex.printStackTrace();
			//System.exit(-2);
		}
		
		

	}

}

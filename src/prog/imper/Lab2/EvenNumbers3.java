package prog.imper.Lab2;

import org.apache.log4j.Logger;

public class EvenNumbers3 {
	
	public static final Logger log= Logger.getLogger(EvenNumbers3.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zakres =1024;
		String evenNumbers=getEvenNumbers(zakres);
		
		log.info(evenNumbers);

	}
	public static String getEvenNumbers(int limit)
	{
		final int maxLimit=100000;
		if(limit>maxLimit)
			return null;
		StringBuilder parzyste=new StringBuilder();
		for (int i = 0; i <= limit; i++) {
			if(i%2==0)
			{
				parzyste.append(i+" ");
			}
			
		}
		
		return parzyste.toString();
	}

}

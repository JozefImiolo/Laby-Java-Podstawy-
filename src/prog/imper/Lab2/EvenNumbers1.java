package prog.imper.Lab2;

import org.apache.log4j.Logger;

public class EvenNumbers1 {
	
	public static final Logger log=Logger.getLogger(EvenNumbers1.class);
	
	public static void main (String[] args)
	{
		int i=1024;
		petla1(i);
		petla2(i);
		petla3(i);
	}
	public static void petla1(int zakres)
	{
		
		for (int i = 0; i <= zakres; i++) {
			if(i%2==0)
			log.info(i);
	}
	}
	public static void petla2(int zakres)
	{
		
		for (int i = 0; i <= zakres; i++) {
			if((i & 1) == 0)
			log.info(i);
	}
	}
	public static void petla3(int zakres)
	{
		
		for (int i = 0; i <= zakres; i+=2) 
			log.info(i);
	
	}

}

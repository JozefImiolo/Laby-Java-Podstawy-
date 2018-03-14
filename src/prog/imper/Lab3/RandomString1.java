package prog.imper.Lab3;

import java.util.Random;

import org.apache.log4j.Logger;

public class RandomString1 {
	
	public static final Logger log=Logger.getLogger(RandomString1.class);
	
	private static int ilosc=0;
	private String slowo;
	public RandomString1() {
		
		Random rand=new Random();
		int a=4+rand.nextInt(9);
		StringBuilder tresc=new StringBuilder();
		for (int i = 0; i < a; i++) {
			char c=(char)(rand.nextInt(26)+'A');
			tresc.append(c);
			
			
		}
		ilosc++;
		this.slowo=tresc.toString();
	}
	public String toString()
	{
		return "RandomString [content=" + slowo + "]";
	}
	public String getString()
	{
		return slowo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		RandomString1  tablica[]=new RandomString1[n];
		for (int i = 0; i < n; i++) {
			
			tablica[i]= new RandomString1();
			
		}
		for (RandomString1 randomString1 : tablica) {
			
			log.info(randomString1.toString());
			log.info(ilosc);

		}

	}
	
	

}

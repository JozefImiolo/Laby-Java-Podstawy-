package prog.imper.Lab2;

import org.apache.log4j.Logger;

public class XOR3 {

	public static final Logger log=Logger.getLogger(XOR2.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5,y=10;
		log.info("Przed swapem: "+ x+ " "+y);
		int[] wynik=Swap(x,y);
		x=wynik[0];
		y=wynik[1];
		
		log.info("Po swapie: "+ x+ " "+y);
		
		

	}
	
	public static int[] Swap(int a, int b)
	{
		int[] result=new int[2];
		a = a ^ b;
		b = a ^ b;
		a = a^ b;
		
		result[0] = a;
		result[1] = b;
		
		return result;
		

	}

}

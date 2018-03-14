package prog.imper.Lab2;

import java.util.Arrays;
import java.util.Random;

import org.apache.log4j.Logger;

public class Arrays1 {
	
	public static final Logger log=Logger.getLogger(Arrays1.class);
	
	@Override
	public String toString() {
		return "Arrays1 [array=" + Arrays.toString(array) + "]";
	}


	
	private static final int MAX  =100;
	private int [] array;
	
	/*public Arrays1(int... array) {
		super();
		this.array =array;
	}*/
	public Arrays1(int n) {
		super();
		Random random=new Random();
		array=new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i]=random.nextInt(MAX);
			
		}
		
	}
	
	public Arrays1(int array[]) {
		super();
		this.array =array;
	}
	public int getMax()
	{
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max)
				max=array[i];
		}
		return max;
	}
	public int getMin()
	{
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<min)
				min=array[i];
		}
		return min;
	}
	public double getAverage() {
		int sum=0;
		for (int i = 0; i < array.length; i++) {
				sum+=array[i];
		}
		return (double)sum/array.length;
	}
	

	public static void main(String[] args) {
	
		if(args.length!=1)
		{
			log.error("Usage: <max-int>");
			System.exit(-2);
		}
		Integer max=null;
		try {
			
			max=Integer.parseInt(args[0]);
		}
		catch (NumberFormatException e) {
			log.error("Invalid argument: "+ args[0]);
			System.exit(-3);
		}
		Arrays1 tab=new Arrays1(max);
		log.info(tab.toString());
		log.info("MAX: "+tab.getMax());
		log.info("MIN: "+tab.getMin());
		log.info("AVG: "+tab.getAverage());
		
		
		int[] tablica= {34,432,6,76,3,7,5,2};
		Arrays1 tab1=new Arrays1(tablica);
		log.info(tab1.toString());
		log.info("MAX: "+tab1.getMax());
		log.info("MIN: "+tab1.getMin());
		log.info("AVG: "+tab1.getAverage());
		

	}
	

}

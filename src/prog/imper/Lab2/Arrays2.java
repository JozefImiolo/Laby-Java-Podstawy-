package prog.imper.Lab2;

import java.util.Arrays;
import java.util.Random;

import org.apache.log4j.Logger;

public class Arrays2 {




	public static final Logger log=Logger.getLogger(Arrays2.class);
	
	
	public static int[] getTablica (int size, int max)
	{
		int[] tab=new int[size];
		Random random=new Random();
		for (int i = 0; i < tab.length; i++) {
			tab[i]=random.nextInt(max)+1;
		}
		
		return tab;
		
		
	}
	
	public static int getMax(int[] tab)
	{

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max)
				max = tab[i];
		}
		return max;
	}

	public static int getMin(int[] tab) {
		int min = Integer.MAX_VALUE;
		for (int value: tab) {
			if (value < min)
				min = value;
		}
		return min;
	}

	public static double getAverage(int [] tab) {
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
		}
		return (double) sum / tab.length;
	}
    private static int findMaxIdx(int[] arr) {
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
            	max=arr[i];
                idx = i;
            }
        }
        return idx;
    }
	
	
	
	public static void main(String[] args) {
		int[] tablica=getTablica(50, 100);
		log.info(getMax(tablica));
		log.info(getMin(tablica));
		log.info(getAverage(tablica));
		log.info(Arrays.toString(tablica));
		log.info(findMaxIdx(tablica));
		
		

	}

}

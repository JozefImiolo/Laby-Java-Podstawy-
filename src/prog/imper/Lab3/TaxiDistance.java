package prog.imper.Lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxiDistance <T extends Number> implements Distance3 <T> {
	@Override
	public double distance(List<T> vectorA, List<T> vectorB) throws NotmatchingDimensionsException {
		if(vectorA.size()!=vectorB.size())
		{
			throw new NotmatchingDimensionsException("Wektory nie s¹ równe");
			
		}
		double sum=0.0;
		for (int i = 0; i < vectorA.size(); i++) {
			
			sum+=Math.abs(vectorA.get(i).doubleValue()-vectorB.get(i).doubleValue());
		}
		return sum;
	}

	public static void main(String[] args) {
	List<Integer> listA=Arrays.asList(4,5,6,5);
	List<Integer> listB=Arrays.asList(4,5,6,5,3);
	TaxiDistance<Integer> odl1=new TaxiDistance<>();
	try {
		System.out.println(odl1.distance(listA, listB));
	}
	catch(NotmatchingDimensionsException ex)
	{
		System.out.println(ex.getMessage());
	}

	}

	

}

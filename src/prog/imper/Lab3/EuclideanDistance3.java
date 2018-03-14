package prog.imper.Lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EuclideanDistance3<T extends Number> implements Distance3<T> {
	
	@Override
	public double distance(List<T> vectorA, List<T> vectorB) throws NotmatchingDimensionsException {
		if(vectorA.size()!=vectorB.size())
		{
			throw new NotmatchingDimensionsException(vectorA.size() + " not matches " + vectorB.size());
		}
		int sum=0;
		for(int i=0; i<vectorA.size(); i++)
		{
			
			sum+=Math.pow(vectorA.get(i).intValue()-vectorB.get(i).intValue(), 2);
		}
		return Math.sqrt(sum);
	}


	public static void main(String[] args) {
		List<Integer> vectorA=Arrays.asList(0, 0,7);
		List<Integer> vectorB=Arrays.asList(1, 1);
		EuclideanDistance3<Integer> odl1=new EuclideanDistance3<>();
		try {
			System.out.println(odl1.distance(vectorA, vectorB));
		}
		catch(NotmatchingDimensionsException ex)
		{
			System.out.println("Wektory nie s¹ równe");
		}
		

	}


}

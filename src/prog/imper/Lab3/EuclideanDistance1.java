package prog.imper.Lab3;

import org.apache.log4j.Logger;

public class EuclideanDistance1 implements Distance1 {
	public static final Logger log = Logger.getLogger(EuclideanDistance1.class);

	@Override
	public double distance(double[] vectorA, double[] vectorB) throws NotmatchingDimensionsException
	{
		if (vectorA.length != vectorB.length) {
			throw new NotmatchingDimensionsException(vectorA.length + " not matches " + vectorB.length);
		
		}
		double sum = 0;
		for (int i = 0; i < vectorB.length; i++) {
			sum += Math.pow(vectorA[i] - vectorB[i], 2);
		}
		return Math.sqrt(sum);
	}

	public static void main(String[] args) {
		EuclideanDistance1 odl1 = new EuclideanDistance1();
		double[] p1 = { 0, 0 };
		double[] p2 = { 1, 1 };
		try {
			log.info(odl1.distance(p1, p2));
		}
		catch (NotmatchingDimensionsException ex) {
			
			System.out.println(ex);

		}

	}

}

package prog.imper.Lab3;

public class EuclideanDistance2 implements Distance2{
	
	@Override
	public double distance(double[] vectorA, double[] vectorB) {
		if (vectorA.length != vectorB.length) {
			System.out.println("Wektory nie s¹ w tych samych wymiarach");
			System.exit(-2);
		
		}
		double sum = 0;
		for (int i = 0; i < vectorB.length; i++) {
			sum += Math.pow(vectorA[i] - vectorB[i], 2);
		}
		return Math.sqrt(sum);
	}


	public static void main(String[] args) {
		EuclideanDistance2 odl1 = new EuclideanDistance2();
		double[] p1 = { 0, 0 };
		double[] p2 = { 1, 1 };
		System.out.println("Odleglosc wynosi: "+ odl1.distance(p1, p2));

	}

	

}

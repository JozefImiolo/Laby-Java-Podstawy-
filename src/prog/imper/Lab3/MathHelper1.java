package prog.imper.Lab3;

public class MathHelper1 {

	static final double LICZBA_PI = 3.14;

	static boolean czyAry(double...tab) {
		if (tab.length < 3)
			return true;
		for (int i = 0; i < tab.length - 2; i++) {
			if (tab[i + 1] - tab[i] != tab[i + 2] - tab[i + 1])
				return false;
		}
		return true;
	}

	public static boolean czyGeo(double... ds) {
		if (ds.length==0)
			return false;
		if (ds.length < 2)
			return true;
		if (ds[0] == 0)
			return false;
		double mnoznik = ds[1] / ds[0];
		for (int i = 1; i < ds.length - 1; i++) {
			if (ds[i] == 0)
				return false;
			if (mnoznik != ds[i + 1] / ds[i])
				return false;
		}

		return true;
	}
	public static double czyHar(double...ds)
	{
		double sum=0;
		for (int i = 0; i < ds.length; i++) {
			sum+=1/ds[i];
		}
		return ds.length/sum;
	}
	
	

}

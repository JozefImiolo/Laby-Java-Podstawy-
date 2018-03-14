package prog.imper.Lab4;

import java.awt.Point;

public class Triangle1 {

	private final Punkt[] punkty = new Punkt[3];

	public Triangle1(Punkt a, Punkt b, Punkt c) {
		this.punkty[0] = a;
		this.punkty[1] = b;
		this.punkty[2] = c;

	}

	public static class Punkt {
		private final double x;
		private final double y;

		Punkt(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}

		public double distance(Punkt a) {
			return Math.sqrt(Math.pow(x-a.x, 2)+Math.pow(y-a.y, 2));
		}
	}

	public double getArea() {
		// Wzór Herona
		double odl1 = punkty[0].distance(punkty[1]);
		double odl2 = punkty[1].distance(punkty[2]);
		double odl3 = punkty[2].distance(punkty[0]);
		double obw2 = (odl1 + odl2 + odl3) / 2;
		double pole = Math.sqrt(obw2 * (obw2 - odl1) * (obw2 - odl2) * (obw2 - odl3));
		return pole;

	}

	public static void main(String[] args) {
		Punkt[] punkciki = new Punkt[3];
		//for (Punkt punkt : punkciki) {
			punkciki[0] = new Punkt(0, 0);
			punkciki[1] = new Punkt(2, 0);
			punkciki[2] = new Punkt(0, 2);
			
		//}
		Triangle1 trojkat = new Triangle1(punkciki[0], punkciki[1], punkciki[2]);
		System.out.println(trojkat.getArea());

	}

}

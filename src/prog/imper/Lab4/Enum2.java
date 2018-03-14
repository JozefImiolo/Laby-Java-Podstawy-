package prog.imper.Lab4;

import org.apache.log4j.Logger;

import prog.imper.Lab4.Enum1.Month;

public class Enum2 {
	public static final Logger log=Logger.getLogger(Month2.class);
	public enum Month2{
		JANUARY (31, "January"),
		FEBRUARY (28, "February"),
		MARCH (31, "March"),
		APRIL (30, "April"),
		MAY (31, "May"),
		JUNE (30, "June"),
		JULY (31, "July"),
		AUGUST (31, "August"),
		SEPTEMBER (30, "September"),
		OCTOBER (31, "October"),
		NOVEMBER (30, "November"),
		DECEMBER (31, "December");
	
		private final int dni;
		private final String name;
		private final int number;
		private Month2(int dni, String nazwa)
		{
			this.dni=dni;
			this.name=nazwa;
			this.number=ordinal()+1;
		}
		public int getDni() {
			return dni;
		}
		public String getName() {
			return name;
		}
		public Month2 getNext()
		{
			if(this.number>=12)
			{
				return Month2.values()[0];
			}
			else
			{
				return Month2.values()[this.ordinal()+1];
			}
		}
		public String toString() {
			return name+" " + dni+" " + number;
		}
	}
	
	public static void main(String[] args)
	{
		Month2 miesiac=Month2.FEBRUARY;
		System.out.println(miesiac+ " idze luty podkuj buty");
		System.out.println(miesiac.dni+ " "+ miesiac.ordinal());
		System.out.println(miesiac.getName()+ " "+ miesiac.getDni());
		System.out.println(miesiac.getNext().name);
		miesiac=miesiac.getNext();
		System.out.println(miesiac+ " "+ miesiac.ordinal());
		for(Month2 msc : Month2.values()) {
			if(msc.dni==30)
			{
				log.info(msc.name + " has " + msc.dni + " days in month.");
				log.info(msc.name + " in calendar is " + msc.getDni() + "th month");
				log.info("Next month is " + msc.getNext().name);
			}
			
		}
		
	}
}

package prog.imper.Lab4;

import org.apache.log4j.Logger;

public class Enum1 {
	public static final Logger log=Logger.getLogger(Enum1.class);
	public enum Month{
		
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
		private final String name;
		private final int numOfDays;
		private final int number;
		
		private Month(int numOfDays, String name)
		{
			this.numOfDays=numOfDays;
			this.name=name;
			this.number=ordinal()+1;
		}
		
		public String getName() {
			return this.name;
		}

		public int getNumber() {
			return number;
		}
		 public Month getNext(Month m)
		 {
			 if(m.number>=12)
			 {
				 return Month.values()[0];
			 }
			 else
			 {
				 return Month.values()[m.ordinal()+1];
			 }
		 }
	}
	
	public static void main(String[] args) {
		
		// logs all months that have 31 days in Gregorian Calendar
		Month miesiac=Month.APRIL;
		log.info(miesiac+ " " +miesiac.numOfDays+ " Miesi¹c w roku: "+miesiac.number);
		for (Month m : Month.values()) {
			if (m.numOfDays == 31) {
				log.info(m.name + " has " + m.numOfDays + " days in month.");
				log.info(m.name + " in calendar is " + m.getNumber() + "th month");
				log.info("Next month is " + m.getNext(m).name);
			}
			
		}
	}

}

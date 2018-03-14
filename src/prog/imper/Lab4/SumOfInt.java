package prog.imper.Lab4;

import org.apache.log4j.Logger;



public class SumOfInt {

	public static final Logger log = Logger.getLogger(SumOfInt.class);

	public static void main(String[] args) {

		if (args.length == 0) {
			log.error("Provide list of numbers");
			System.exit(-2);
		}
		int sum = 0;
		for (String slowo : args) {
			try {
				sum += Integer.parseInt(slowo);
			} catch (NumberFormatException ex) {
				log.error("Invalid input argument: " + slowo + " skipped");
				System.exit(-3);
			}

		}
		log.info("Sum=" + sum);

	}

}
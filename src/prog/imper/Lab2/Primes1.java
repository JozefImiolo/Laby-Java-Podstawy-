package prog.imper.Lab2;

import org.apache.log4j.Logger;

public class Primes1 {

	public static Logger log = Logger.getLogger(Primes1.class);

	public static void main(String[] args) {

		final int limit = 1024;

		log.info(evenNumbersPrinter(limit));

	}

	/**
	 * generates string of primal numbers from 1 to limit separated by space
	 * 
	 * @param limit
	 *            upper bound for numbers generator
	 * @return String of even numbers separated by space or null if limit is greater
	 *         than 10000
	 */
	public static String evenNumbersPrinter(int limit) {

		// check if limit is greated than 10000, if so return null
		if (limit >= 10000)
			return null;

		// set an array of booleans of size limit+1 all set to false
		boolean[] primalNumbers = new boolean[limit + 1];

		// removes 0 from set of numbers as zero is not primal number
		primalNumbers[0] = true;

		// set a limit for for loop that is not greater than sqrt from limit
		int loopLimit = (int) Math.sqrt(limit);

		// loops through numbers from 2 to loopLimit
		// if number is not primal set array value to true
		for (int i = 2; i <= loopLimit; i++) {
			if (primalNumbers[i] == true)
				continue;

			int num = (int) Math.pow(i, 2);
			while (num < primalNumbers.length) {
				primalNumbers[num] = true;
				num += i;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < primalNumbers.length; i++) {
			if (!primalNumbers[i]) {
				sb.append(i + " ");
			}
		}
		return sb.toString();
	}

}

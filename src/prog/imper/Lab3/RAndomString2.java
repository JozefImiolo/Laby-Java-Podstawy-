package prog.imper.Lab3;

import java.util.Random;

public class RAndomString2 {
	

		private String str;
		private static int numOfInstances;
		
		public RAndomString2() {
			
			Random rand = new Random();
			int stringLength = rand.nextInt(10) + 4;
			
			StringBuilder sb = new StringBuilder(stringLength);
			
			for (int i = 0; i < stringLength; i++) {
				char randChar = (char) (rand.nextInt(25) + 97);
				sb.append(randChar);
			}
			str = sb.toString();
			numOfInstances++;
		}
		
		public String getString() {
			return str;
		}

		public int getNumOfInstances() {
			return numOfInstances;
		}
}



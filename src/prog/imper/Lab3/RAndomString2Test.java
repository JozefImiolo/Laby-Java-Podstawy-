package prog.imper.Lab3;

import org.apache.log4j.Logger;

public class RAndomString2Test {
	
	public static Logger log = Logger.getLogger(RAndomString2Test.class);

	public static void main(String[] args) {
		
		RAndomString2 rs = new RAndomString2();
		log.info(rs.getNumOfInstances());
		log.info(rs.getString());
		
		RAndomString2[] rsCont = generateRandomStrings(6);
		
		log.info(rsCont[2].getNumOfInstances());
	}
	
	
	public static RAndomString2 [] generateRandomStrings(int numOfInstances) {
		
		RAndomString2 [] rsContainer = new RAndomString2[numOfInstances];
		
		for (int i = 0; i < rsContainer.length; i++) {
			rsContainer[i] = new RAndomString2();
		}
		return rsContainer;
	}

}

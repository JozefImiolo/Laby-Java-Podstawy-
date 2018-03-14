package prog.imper.Lab2;

import org.apache.log4j.Logger;

public class EvenNumers2 {
	public static final Logger log=Logger.getLogger(EvenNumers2.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1)
		{
			log.info("Usage: <max-int>");
			System.exit(-1);
		}
		try
		{
			int max=Integer.parseInt(args[0]);
			for (int i = 0; i <= max; i++) {
				if( ( i & 1) == 0)
				{
					log.info(i);
				}
				
			}
		}
		catch(NumberFormatException ex)
		{
			log.error("Invalid argument: " +args[0]+ " provide unsigned integer");
			System.exit(-2);
		}
		

	}

}

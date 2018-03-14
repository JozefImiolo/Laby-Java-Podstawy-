package prog.imper.Lab1;

import org.apache.log4j.Logger;


public class Hello_Log4j {
	
	public static final Logger logger= Logger.getLogger(Hello_Log4j.class);
	
	public static void main (String[] args)
	{
		logger.info("Start...");
		logger.info("Start...");
	}


}

package apache_log4j;

import org.apache.logging.log4j.*;

public class Demo 
{
	//to run logger file then we have Use the LogManager
	private static Logger Log=LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args)
	{
		Log.debug("Clicked on buttom");
		
		Log.info("We are clicking on the buttom");
		
		Log.error("Not abled to clicked on all button");
		
		Log.fatal("Some button was missing, while running the test cases");
	}
}
 
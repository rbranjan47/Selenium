package apache_log4j;


import org.apache.logging.log4j.*;

public class intro 
{
	//To initiate the Log4J Jar files, we have to Run the "Log Manager" as private
	private static Logger log=LogManager.getLogger(intro.class.getName());
	//inside the Logger, we have to pass the Path of the Logger files
	
	public static void main(String[] args)
	{
		log.debug("Using log object to debug through log object, i.e. Information of performed action");
		
		
		if(11>10)
			log.info("this is info which is used to give the information about performed action");
		
			log.error("this is error,used to give the error occured while performing the action");
		
		log.fatal("this is fatal i.e Information for what causes error occured");
		
	
	}
}

package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.SystemPropertiesPropertySource;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
public class Log4jDemo {

   private static Logger logger = LogManager.getLogger(Log4jDemo.class);


    public static void main(String[] args) {

        System.out.println("\n Sree......      \n");


        logger.trace("trace message");
        logger.info("information Message");
        logger.error("Error");
        logger.warn("warning");
        logger.fatal("fatal");

        System.out.println("\n completed");
    }


}

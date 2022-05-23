import java.util.logging.Level;
import java.util.logging.Logger;

class LoggingExamples1 {

	

    private static final Logger logger =
        Logger.getLogger(Addition.class.getName());


    public void doIt() {
        logger.entering(getClass().getName(), "doIt");

        try{
            //... something that can throw an exception
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error doing XYZ", e);
        }

        logger.exiting(getClass().getName(), "doIt");
    }

}

public class LoggingExamples
{
public static void main(String[] args) {
	
	LoggingExamples1 le1 = new LoggingExamples1();
	le1.doIt();
	
}
}
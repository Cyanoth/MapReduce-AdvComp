import java.util.logging.*;

/**
 * Created by Charlie on 09/11/2017.
 */
public class    MainApplication
{
    //TODO: Setup constants for max-threads
    private static final Logger LOGGER = Logger.getLogger(MainApplication.class.getName());

    //TODO: Change hardcoded paths into command line arguments and test if they exist/not null
    public static void main(String[] args){
        LOGGER.log(Level.INFO, "Application Started");
        Objective1.startObjective1();
    }

}
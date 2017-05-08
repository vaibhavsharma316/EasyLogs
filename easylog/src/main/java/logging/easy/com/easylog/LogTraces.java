package logging.easy.com.easylog;

/**
 * Created by vaibhav on 4/28/2017.
 */

public class LogTraces {


    public static void print(Exception exception)
    {

        if (LogConfig.logtraceMode)
        {
            exception.printStackTrace();
        }



    }



}

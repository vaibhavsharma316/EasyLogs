package logging.easy.com.easylog;

import android.util.Log;

/**
 * Created by vaibhav on 4/28/2017.
 */

public class L {


    public static void v(String tagname,String message)
    {

        if (LogConfig.isDebug)
        {

            Log.v(tagname,message);


        }

    }

    public static void e(String tagname,String message)
    {

        if (LogConfig.isDebug)
        {

            Log.e(tagname,message);


        }

    }


    public static void w(String tagname,String message)
    {

        if (LogConfig.isDebug)
        {

            Log.w(tagname,message);


        }

    }



    public static void d(String tagname,String message)
    {

        if (LogConfig.isDebug)
        {

            Log.d(tagname,message);


        }

    }

    public static void i(String tagname,String message)
    {

        if (LogConfig.isDebug)
        {

            Log.i(tagname,message);


        }

    }




}

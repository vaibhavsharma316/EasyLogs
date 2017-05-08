package logging.easy.com.easylogs;

import android.app.Application;

import logging.easy.com.easylog.LogConfig;

/**
 * Created by vaibhav on 5/8/2017.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LogConfig.setIsDebug(true);
        LogConfig.setLogtraceMode(false);

    }
}

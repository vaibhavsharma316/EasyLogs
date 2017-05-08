package logging.easy.com.easylogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;

import logging.easy.com.easylog.L;
import logging.easy.com.easylog.LogTraces;

public class SampleActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_actvity);

        L.v(getClass().getName(),"hello world");

       try {


           int i=0;
            if (i<1)
            {
               throw new Exception("hello");

            }

       }
       catch (Exception ex)
       {
           LogTraces.print(ex);
       }


    }
}

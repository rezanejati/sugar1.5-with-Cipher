package library.android.eniac.myapplication;

import android.app.Application;

import com.orm.SugarContext;

/**
 * Created by RezaNejati on 1/31/2019.
 */
public class MyApplication extends Application {


    public void onCreate() {
        super.onCreate();
        SugarContext.init(this,"SamplePassword");
    }

    }

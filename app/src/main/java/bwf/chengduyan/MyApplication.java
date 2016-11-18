package bwf.chengduyan;

import android.app.Application;
import android.content.Context;

/**
 * Created by Lizhangfeng on 2016/11/11 0011.
 * Description:
 */

public class MyApplication extends Application {

    private static MyApplication myApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
    }

    public static Context getAppContext(){

        return myApplication.getApplicationContext();
    }
}

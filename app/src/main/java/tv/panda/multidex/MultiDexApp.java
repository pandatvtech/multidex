package tv.panda.multidex;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex2;

/**
 * Created by zourongbo on 2016/11/16.
 */

public class MultiDexApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex2.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}

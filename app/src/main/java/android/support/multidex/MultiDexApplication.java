package android.support.multidex;

import android.app.Application;
import android.content.Context;

/**
 * Created by zourongbo on 2016/11/16.
 */

public class MultiDexApplication extends Application {
    public MultiDexApplication() {
    }

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
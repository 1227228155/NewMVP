package net.mlh.zqy.mvp1;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

/**
 * Created by 1227228155@qq.com on 2018/4/11.
 */

public class App extends Application{
    private static App app = null;
    //private List<Activity> mList = new LinkedList<>();
    public static App getInstance() {
        if (app == null) {
            synchronized (App.class) {
                if (app == null) {
                    app = new App();
                }
            }
        }
        return app;
    }


    public static Resources getAppResources() {
        return app.getResources();
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

    }
}

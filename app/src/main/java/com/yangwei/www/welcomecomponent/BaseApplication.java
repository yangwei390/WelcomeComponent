package com.yangwei.www.welcomecomponent;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author yangwei
 * @Date 2019/3/21
 * @Description BaseApplication
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initArouter();
    }

    private void initArouter() {
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }
}

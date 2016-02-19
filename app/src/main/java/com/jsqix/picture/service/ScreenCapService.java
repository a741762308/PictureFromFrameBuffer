package com.jsqix.picture.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.jsqix.utils.ScreentShotUtil;

public class ScreenCapService extends Service {

    public static final String ACTION = "com.qinshun.service.ScreenCapService";
    final String TAG = getClass().getName();

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ScreentShotUtil.getInstance().takeScreenshot(ScreenCapService.this, "/sdcard/aa.png");
            }
        }).start();
        return super.onStartCommand(intent, flags, startId);
    }


}
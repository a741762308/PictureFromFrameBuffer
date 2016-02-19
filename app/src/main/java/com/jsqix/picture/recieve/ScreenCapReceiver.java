package com.jsqix.picture.recieve;

import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

import com.jsqix.picture.service.ScreenCapService;
import com.jsqix.picture.utils.PollingUtils;

public class ScreenCapReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            PollingUtils.startPollingService(context, AlarmManager.ELAPSED_REALTIME, SystemClock.elapsedRealtime(), 5, ScreenCapService.class, ScreenCapService.ACTION);
        }
    }

}

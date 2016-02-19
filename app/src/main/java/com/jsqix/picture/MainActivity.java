package com.jsqix.picture;

import android.app.AlarmManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jsqix.picture.service.ScreenCapService;
import com.jsqix.picture.utils.PollingUtils;
import com.jsqix.utils.ScreentShotUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    public TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn = (Button) findViewById(R.id.btn);
        tx = (TextView) findViewById(R.id.text);
        btn.setOnClickListener(this);
        PollingUtils.startPollingService(this, AlarmManager.ELAPSED_REALTIME, SystemClock.elapsedRealtime(), 60, ScreenCapService.class, ScreenCapService.ACTION);
    }

    @Override
    public void onClick(View v) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ScreentShotUtil.getInstance().takeScreenshot(MainActivity.this, "/sdcard/aa.png");
            }
        }).start();
    }

}

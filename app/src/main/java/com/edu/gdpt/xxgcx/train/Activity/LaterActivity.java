package com.edu.gdpt.xxgcx.train.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.MainActivity;
import com.edu.gdpt.xxgcx.train.R;

import java.util.Timer;
import java.util.TimerTask;

public class LaterActivity extends AppCompatActivity {
    private TextView tv;
    private int reclen = 6;
    private Handler handler;
    private Runnable runnable;
    Timer timer=new Timer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_later);
        tv=findViewById(R.id.tv_later_intent);
        timer.schedule(timerTask,500,1000);
        handler=new Handler();
        handler.postDelayed(runnable=new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(LaterActivity.this, MainActivity.class));
                finish();
            }
        },6000);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.tv_later_intent:
                        startActivity(new Intent(LaterActivity.this, MainActivity.class));
                        finish();
                        if (runnable !=null){
                            handler.removeCallbacks(runnable);
                        }
                        break;
                        default:
                            break;
                }
            }
        });
    }
    TimerTask timerTask=new TimerTask() {
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    reclen--;
                    tv.setText("跳过("+reclen+")");
                    if (reclen<0){
                        timer.cancel();
                        tv.setVisibility(View.GONE);
                    }
                }
            });

        }
    };
}

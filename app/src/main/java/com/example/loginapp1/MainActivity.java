package com.example.loginapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;

    private ProgressBar mProgressBar;
    private TextView mLoadingText;

    private int mProgressStatus = 0;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        mLoadingText = (TextView) findViewById(R.id.loadCompleteTextView);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(mProgressStatus < 5000){
                    mProgressStatus++;
                    android.os.SystemClock.sleep(5000);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mProgressBar.setProgress(mProgressStatus);
                        }
                    });
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mLoadingText.setVisibility(View.VISIBLE);
                    }
                });
            }
        }).start();

    // Automatically check to new activity.
        timer = new Timer();
        timer.schedule(new TimerTask() {
        @Override
        public void run() {
            Intent intent = new Intent(MainActivity.this, menuActivity.class);
            startActivity(intent);
            finish();
        }
    }, 5000);

    }
}
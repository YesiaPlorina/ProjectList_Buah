package com.example.yesiaplorina.projectlist;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //buat jeda

        Handler jeda = new Handler();
        jeda.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent pindah = new Intent(SplashScreenActivity.this , MainActivity.class);
                startActivity(pindah);
                finish();
            }
        }, 3000);
    }
}

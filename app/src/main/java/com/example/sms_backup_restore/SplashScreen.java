package com.example.sms_backup_restore;// SplashActivity.java

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sms_backup_restore.InternalActivities.secondscreen;

public class SplashScreen extends AppCompatActivity {

    private static final long SPLASH_DELAY = 4000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Use a Handler to delay the start of the main activity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, secondscreen.class);
            startActivity(intent);
            finish();
        }, SPLASH_DELAY);
    }
}

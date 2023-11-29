package com.example.sms_backup_restore.InternalActivities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sms_backup_restore.R;

public class secondscreen extends AppCompatActivity {

    private static final long SPLASH_DELAY = 4000; // 4 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        // Use a Handler to delay the start of the main activity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(secondscreen.this, ThirdScreen.class);
            startActivity(intent);
            finish();
        }, SPLASH_DELAY);
    }
}
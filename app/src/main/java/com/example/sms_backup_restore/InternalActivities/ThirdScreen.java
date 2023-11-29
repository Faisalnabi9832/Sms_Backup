package com.example.sms_backup_restore.InternalActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.sms_backup_restore.R;


public class ThirdScreen extends AppCompatActivity {
    private static final long SPLASH_DELAY = 4000; // 4 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        ImageView imageView = findViewById(R.id.imageViewforvector);
        Glide.with(this).asGif().load(R.drawable.bg_gif_tst).into(imageView);
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(ThirdScreen.this, FourthScreen.class);
            startActivity(intent);
            finish();
        }, SPLASH_DELAY);

    }
}
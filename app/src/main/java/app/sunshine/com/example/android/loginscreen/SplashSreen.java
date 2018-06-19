package app.sunshine.com.example.android.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashSreen extends AppCompatActivity {
    private static int SPLASH_TIME = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_sreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashSreen.this , LoginActivity.class);
                startActivity(intent);
                finish();

            }
        },SPLASH_TIME);

    }
}

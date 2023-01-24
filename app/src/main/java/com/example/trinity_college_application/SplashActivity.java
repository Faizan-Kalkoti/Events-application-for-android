package com.example.trinity_college_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        Thread thread = new Thread(){
          public void run()
          {
              try
              {
                  sleep(3000);
              }
              catch (Exception e)
              {
                  e.printStackTrace();
              }
              finally
              {
                  Intent intent = new Intent(SplashActivity.this, Home_page.class);
                  startActivity(intent);
              }

          }
        };
        thread.start();
    }

   public void splashend(View view)
    {
        Intent intent =new Intent(SplashActivity.this, Home_page.class);
        startActivity(intent);
    }


}
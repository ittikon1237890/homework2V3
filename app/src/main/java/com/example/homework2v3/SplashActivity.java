package com.example.homework2v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //todo: โค้ดที่ต้องการสั่งดีเลย์ ครบ3วินาที

                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);//เชื่อมจากหน้าจอนึงไปอีกหน้าจอนึง(หน้าที่อยู่.this,หน้าที่ต้องการไป.class)
                startActivity(intent);//ตัาสั่งเริ่มทำงาน เชื่อมหน้าจอ
                finish();
            }
        }, 3000);
    }
}

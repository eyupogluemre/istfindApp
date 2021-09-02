package com.emreeyupoglu.istfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    // Handler'da kullanmak için integer türünde bir değişken atadık.

    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tanımladığımız Handler ile Intent kısmının ne kadar süre sonra çalışacağını ayarladık.

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                // Tanımladığımız Intent ile MainActivity'den MainActivity2'ye geçişi sağladık.

                Intent homeIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(homeIntent);
                finish();

            }

        // Değişkenimizi burada kullandık. Handler'da değer milisaniye olarak alındığı için 4000 ms, 4 saniyeye eşit olacak ve Splash Screen'imiz 4 saniye boyunca görünecek.

        },SPLASH_TIME_OUT);
    }
}
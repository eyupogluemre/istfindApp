package com.emreeyupoglu.istfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    // Buton değişkenlerimizi atadık.

    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Butona atadığımız OnClickListener metodu ile butona tıklandığı zaman ne olacağını belirttik.

        btn1 = (Button)findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Atadığımız Intent ile butona tıklandığında MainActivity2'den MapsActivity'ye geçiş yapılmasını sağladık.

                Intent secondIntent = new Intent(MainActivity2.this, MapsActivity.class);
                startActivity(secondIntent);
                finish();

            }
        });

        // Butona atadığımız OnClickListener metodu ile butona tıklandığı zaman ne olacağını belirttik.

        btn2 = (Button)findViewById(R.id.button6);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Atadığımız Intent ile butona tıklandığında MainActivity2'den WizardActivity'ye geçiş yapılmasını sağladık.

                Intent thirdIntent = new Intent(MainActivity2.this, WizardActivity.class);
                startActivity(thirdIntent);
                finish();

            }
        });


    }
}
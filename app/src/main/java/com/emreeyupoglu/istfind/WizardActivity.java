package com.emreeyupoglu.istfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

public class WizardActivity extends AppCompatActivity {

    // Buton ve EditText atamamızı yaptık.

    private Button btn3;
    EditText editsayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wizard);

        editsayi=(EditText)findViewById(R.id.editTextNumber);
        btn3 = (Button)findViewById(R.id.button);

        // Butona atadığımız OnClickListener metodu ile butona tıklandığı zaman ne olacağını belirttik.

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Kullanıcıdan EditText aracılığıyla almış olduğumuz veriyi girilensayi isminde String bir ifadeye eşitledik.

                String girilensayi = editsayi.getText().toString();

                // girilensayi isimli String ifademizi tanımladığımız Intent ile putExtra metodunu kullanarak WizardActivity'den FinalMapsActivity'ye gönderdik.

                Intent sixthIntent = new Intent(WizardActivity.this, FinalMapsActivity.class);
                sixthIntent.putExtra("a", girilensayi);
                startActivity(sixthIntent);
                finish();
            }
        });
    }

    // Geri tuşuna basıldığında WizardActivity'den MainActivity2'ye geçişi sağlayan kod bloğu.

    @Override
        public void onBackPressed() {

            super.onBackPressed();
            Intent fourthIntent = new Intent(WizardActivity.this,MainActivity2.class);
            startActivity(fourthIntent);
            finish();

        }
}
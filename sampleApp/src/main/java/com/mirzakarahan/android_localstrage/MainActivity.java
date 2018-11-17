package com.mirzakarahan.android_localstrage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.mirzakarahan.localstrage.LocalStrage;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txtLclStrage;
    EditText edtValue;
    Button btnSave,btnSavePrivate;
    final String KEY_VALUE = "yaziDizi";
   // int[] sayilar = {1,2,3,4,5,6,7,8,9,10,11,1123123,312,12};
    ArrayList<Integer> sayilar = new ArrayList<>();
    ArrayList<String> yazilar = new ArrayList<>();
    //String[] yazilar = {"Manisa","İzmir","İstanbul","Ankara","Nevşehir"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLclStrage    = findViewById(R.id.txtLclStrage);
        edtValue        = findViewById(R.id.edtValue);
        btnSave         = findViewById(R.id.btnSave);
        btnSavePrivate  = findViewById(R.id.btnSavePrivate);

        txtLclStrage.setText(LocalStrage.getValue(getApplicationContext(),KEY_VALUE,"Empyt"));
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btnSavePrivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayilar.add(1);
                sayilar.add(2);
                sayilar.add(3);
                sayilar.add(4);
                yazilar.add("Mirza");
                yazilar.add("Berkan");
                yazilar.add("Fatma");
                yazilar.add("Nur");
               LocalStrage.setArrayListString(getApplicationContext(),"asd",yazilar);
               ArrayList<String> a = new ArrayList<>();
               for (String row:LocalStrage.getArrayListString(getApplicationContext(),"asd",a)){
                   Log.d("ArrayList<String>",row);
               }
            }
        });

    }
}

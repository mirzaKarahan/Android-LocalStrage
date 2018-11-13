package com.mirzakarahan.android_localstrage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mirzakarahan.localstrage.LocalStrage;
import com.mirzakarahan.localstrage.LocalStragePrivate;

public class MainActivity extends AppCompatActivity {

    TextView txtLclStrage;
    EditText edtValue;
    Button btnSave,btnSavePrivate;
    final String KEY_VALUE = "KEY_VALUE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLclStrage    = (TextView)findViewById(R.id.txtLclStrage);
        edtValue        = (EditText)findViewById(R.id.edtValue);
        btnSave         = (Button)findViewById(R.id.btnSave);
        btnSavePrivate  = (Button)findViewById(R.id.btnSavePrivate);

        txtLclStrage.setText(LocalStrage.getValue(getApplicationContext(),KEY_VALUE,"Empyt"));
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocalStrage.setValue(getApplicationContext(),KEY_VALUE,edtValue.getText().toString());
                txtLclStrage.setText(edtValue.getText());
            }
        });

        btnSavePrivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocalStragePrivate lsp = new LocalStragePrivate(getApplicationContext(),"APP_PREF",MODE_PRIVATE);
                lsp.setValue(KEY_VALUE,edtValue.getText().toString());
                txtLclStrage.setText(lsp.getValue(KEY_VALUE,"Empty"));
            }
        });
    }
}

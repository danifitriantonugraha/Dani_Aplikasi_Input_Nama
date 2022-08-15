package com.danifitrianto.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    TextView txtNama;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btnSubmit);
        txtNama = findViewById(R.id.txtNama);
        input = findViewById(R.id.txtName);

        btnSubmit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txtNama.setText("Nama Anda : " + input.getText().toString());
                    }
                }
        );
    }
}
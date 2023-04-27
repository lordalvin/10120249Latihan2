package com.example.a10120249latihan2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

// Nama : Stanislaus Katska Alvin Parulian Sitanggang
// Kelas : IF-6
// Tgl Pengerjaan : 22 April 2023
public class MainActivity extends AppCompatActivity {
    TextView registerBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}

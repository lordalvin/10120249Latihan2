package com.example.a10120249latihan2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;
// Nama : Stanislaus Katska Alvin Parulian Sitanggang
// Kelas : IF-6
// Tgl Pengerjaan : 22 April 2023
public class RegisterActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(RegisterActivity.this, AlmostActivity.class);
        startActivity(intent);
    }
}

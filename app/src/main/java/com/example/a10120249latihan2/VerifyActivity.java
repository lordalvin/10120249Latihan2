package com.example.a10120249latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
// Nama : Stanislaus Katska Alvin Parulian Sitanggang
// Kelas : IF-6
// Tgl Pengerjaan : 22 April 2023
public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(VerifyActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}

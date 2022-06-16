package com.example.crud_firestore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.crud_firestore.Model.Siswa;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText teksNim,teksNama;
    Button tblAdd,tblView;
    DatabaseReference reff;
    Siswa siswa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teksNim = findViewById(R.id.editNim);
        teksNama = findViewById(R.id.editNama);

        tblAdd = findViewById(R.id.tombolAdd);
        tblView = findViewById(R.id.tombolView);
        siswa = new Siswa();
        reff = FirebaseDatabase.getInstance().getReference().child("Siswa");

        tblAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(teksNim.length() != 0 && teksNama.length() != 0){
                    siswa.setNim(teksNim.getText().toString().trim());
                    siswa.setNama_siswa(teksNama.getText().toString().trim());
                    reff.push().setValue(siswa);
                    Toast.makeText(MainActivity.this,"Data Tesimpan",Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText(MainActivity.this,"Data Kosong!",Toast.LENGTH_LONG).show();
                }
                teksNim.setText("");
                teksNama.setText("");
            }
        });

        tblView.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, MyListData.class));
            }
        });

    }
}



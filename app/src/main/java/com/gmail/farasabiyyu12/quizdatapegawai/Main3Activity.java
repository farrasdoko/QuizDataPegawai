package com.gmail.farasabiyyu12.quizdatapegawai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Main3Activity extends AppCompatActivity {

    EditText etIbu, etBap, etIstri;
    Spinner spkel, span;
    Button btns;
    String[] kel = {
            "Sudah", "Belum"
    };
    String[] an = {
            "0", "1", "2", "3"
    };
    String item5, item6;

    private static final int Sudah = 0;
    private static final int Belum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        etBap = (EditText)findViewById(R.id.etAyah);
        etIbu = (EditText)findViewById(R.id.etIbu);
        etIstri = (EditText)findViewById(R.id.etIstri);
        span = (Spinner)findViewById(R.id.spJumlahAnak);
        spkel = (Spinner)findViewById(R.id.spKeluarga);
        btns = (Button)findViewById(R.id.btnSub);

        Intent a2 = getIntent();
        final String ambildata7 = a2.getStringExtra("user");
        final String ambildata8 = a2.getStringExtra("fullname");
        final String ambildata9 = a2.getStringExtra("email");
        final String ambildata10 = a2.getStringExtra("alamat");
        final String ambildata11 = a2.getStringExtra("nomor");
        final String ambildata12 = a2.getStringExtra("Jenis");
        final String ambildata13 = a2.getStringExtra("PT");
        final String ambildata14 = a2.getStringExtra("IPK");
        final String ambildata15 = a2.getStringExtra("jurusan");
        final String ambildata16 = a2.getStringExtra("tingkat");

        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, kel);
        spkel.setAdapter(adapter4);
        spkel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                item5 = adapterView.getItemAtPosition(i).toString();
                switch (i){
                    case Sudah:
                        etIstri.setVisibility(View.VISIBLE);
                        span.setVisibility(View.VISIBLE);
                        break;
                    case Belum:
                        etIstri.setVisibility(View.GONE);
                        span.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, an);
        span.setAdapter(adapter5);
        span.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                item6 = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sbap = etBap.getText().toString();
                String sistri = etIstri.getText().toString();
                String sibus = etIbu.getText().toString();

                Intent no3 = new Intent(getApplication(), ActivityPenampil.class);
                no3.putExtra("bap", sbap);
                no3.putExtra("ibu", sibus);
                no3.putExtra("keluarga", item5);
                no3.putExtra("anak", item6);
                no3.putExtra("istri", sistri);
                no3.putExtra("user", ambildata7);
                no3.putExtra("fullname", ambildata8);
                no3.putExtra("email", ambildata9);
                no3.putExtra("alamat", ambildata10);
                no3.putExtra("nomor", ambildata11);
                no3.putExtra("Jenis", ambildata12);
                no3.putExtra("PT", ambildata13);
                no3.putExtra("IPK", ambildata14);
                no3.putExtra("jurusan", ambildata15);
                no3.putExtra("tingkat", ambildata16);

                startActivity(no3);
            }
        });
    }
}

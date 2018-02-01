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

public class Main2Activity extends AppCompatActivity {

    EditText etPT, etIPK;
    Spinner spTP, spju;
    Button btn2;
    String[] jurusan = {
      "Teknik", "TKJ", "RPL", "Automotif"
    };
    String[] Tingkat = {
            "SD", "SMP", "SMK", "D3", "S1", "S2"
    };
    String item2, item3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etPT = (EditText)findViewById(R.id.etPenTer);
        etIPK = (EditText)findViewById(R.id.etIPK);
        spju = (Spinner)findViewById(R.id.spJurusan);
        spTP = (Spinner)findViewById(R.id.spTingkatPendidikan);
        btn2 = (Button)findViewById(R.id.btn2);

        Intent a1 = getIntent();
        final String ambildata = a1.getStringExtra("user");
        final String ambildata2 = a1.getStringExtra("fullname");
        final String ambildata3 = a1.getStringExtra("email");
        final String ambildata4 = a1.getStringExtra("alamat");
        final String ambildata5 = a1.getStringExtra("nomor");
        final String ambildata6 = a1.getStringExtra("Jenis");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, jurusan);
        spju.setAdapter(adapter2);
        spju.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                item2 = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        final ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Tingkat);
        spTP.setAdapter(adapter3);
        spTP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                item3 = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String spt = etPT.getText().toString();
                String sipk = etIPK.getText().toString();

                Intent no2 = new Intent(getApplication(), Main3Activity.class);
                no2.putExtra("PT", spt);
                no2.putExtra("IPK", sipk);
                no2.putExtra("jurusan", item2);
                no2.putExtra("tingkat", item3);
                no2.putExtra("Jenis", ambildata6);
                no2.putExtra("nomor", ambildata5);
                no2.putExtra("alamat", ambildata4);
                no2.putExtra("email", ambildata3);
                no2.putExtra("fullname", ambildata2);
                no2.putExtra("user", ambildata);
                startActivity(no2);


            }
        });
    }
}

package com.gmail.farasabiyyu12.quizdatapegawai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityPenampil extends AppCompatActivity {
    TextView user, full, em, jen, noh, ala, pet, tip, ipk, jur, ibuu, bapa, keluar, istri, anaak, gaji, gajib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penampil);

        user = (TextView)findViewById(R.id.username);
        full = (TextView)findViewById(R.id.fullname);
        em = (TextView)findViewById(R.id.email);
        jen = (TextView)findViewById(R.id.jeniskelamin);
        noh = (TextView)findViewById(R.id.nohp);
        ala = (TextView)findViewById(R.id.alamat);
        pet = (TextView)findViewById(R.id.pendidikanterakhir);
        tip = (TextView)findViewById(R.id.tingkatpendidikan);
        ipk = (TextView)findViewById(R.id.ipk);
        jur = (TextView)findViewById(R.id.jurusan);
        ibuu = (TextView)findViewById(R.id.namaibu);
        bapa = (TextView)findViewById(R.id.namabapak);
        keluar = (TextView)findViewById(R.id.keluargaa);
        istri = (TextView)findViewById(R.id.istrii);
        anaak = (TextView)findViewById(R.id.anaak);
        gaji = (TextView)findViewById(R.id.gaji);
        gajib = (TextView)findViewById(R.id.gajib);

        Intent a1 = getIntent();
        String ambildata = a1.getStringExtra("user");
        String ambildata2 = a1.getStringExtra("fullname");
        String ambildata3 = a1.getStringExtra("email");
        String ambildata4 = a1.getStringExtra("alamat");
        String ambildata5 = a1.getStringExtra("nomor");
        String ambildata6 = a1.getStringExtra("Jenis");
        String ambildata7 = a1.getStringExtra("PT");
        String ambildata8 = a1.getStringExtra("IPK");
        String ambildata9 = a1.getStringExtra("istri");
        String ambildata11 = a1.getStringExtra("jurusan");
        String ambildata12 = a1.getStringExtra("tingkat");
        String ambildata13 = a1.getStringExtra("anak");
        String ambildata14 = a1.getStringExtra("keluarga");
        String ambildata15 = a1.getStringExtra("ibu");
        String ambildata16 = a1.getStringExtra("bap");

        String wife = ambildata9;
        String son = ambildata13;
        String kel = ambildata14;
        String tips = ambildata12;

        if (tips.equalsIgnoreCase("S1")){
            gaji.setText("3000000");
        }else if (tips.equalsIgnoreCase("S2")){
            gaji.setText("5000000");
        }else if (tips.equalsIgnoreCase("D3")){
            gaji.setText("2700000");
        }else if (tips.equalsIgnoreCase("SMK")){
            gaji.setText("2000000");
        }else if (tips.equalsIgnoreCase("SMP")) {
            gaji.setText("1000000");
        }else if (tips.equalsIgnoreCase("SD")) {
            gaji.setText("500000");
        }

        String gajiawal = gaji.getText().toString();
        int gajia = Integer.parseInt(gajiawal);

        if (son.equalsIgnoreCase("0")){
            gajib.setText("Gaji Perbulan: " + (gajia + 700000));
        }else if (son.equalsIgnoreCase("1")){
            gajib.setText("Gaji Perbulan: " + (gajia + 1000000));
        }else if (son.equalsIgnoreCase("2")){
            gajib.setText("Gaji Perbulan: " + (gajia + 2000000));
        }else if (son.equalsIgnoreCase("3")){
            gajib.setText("Gaji Perbulan: " + (gajia + 3000000));
        }

        if (wife.isEmpty()){
            istri.setVisibility(View.GONE);
            anaak.setVisibility(View.GONE);
            gaji.setVisibility(View.VISIBLE);
        }else if (kel.equalsIgnoreCase("Sudah")){
            istri.setVisibility(View.VISIBLE);
            anaak.setVisibility(View.VISIBLE);
            gaji.setVisibility(View.VISIBLE);
        }

        user.setText("Username: " + ambildata);
        full.setText("Fullname: " + ambildata2);
        em.setText("Email: " + ambildata3);
        jen.setText("Jenis Kelamin: " + ambildata6);
        noh.setText("no HP: " + ambildata5);
        ala.setText("Alamat: " + ambildata4);
        pet.setText("Pendidikan Terakhir: " + ambildata7);
        tip.setText("Tingkat Pendidikan: " + ambildata12);
        ipk.setText("IPK: " + ambildata8);
        jur.setText("Jurusan: " + ambildata11);
        ibuu.setText("Nama Ibu: " + ambildata15);
        bapa.setText("Nama Bapak: " + ambildata16);
        keluar.setText("Status Keluarga: " + ambildata14);
        istri.setText("Nama Istri: " + ambildata9);
        anaak.setText("Jumlah Anak: " + ambildata13);
    }
}

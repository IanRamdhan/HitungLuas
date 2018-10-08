package com.fryanramzkhar.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //membuat Variable Global
    TextView txtJdl;
    Button btnStart;
    EditText edtText;
    EditText edtPanjang;
    EditText edtLebar;
    TextView txtHasil;


    //membuat Varible untuk menghitung Luas PP
    Integer panjang,lebar,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtJdl = findViewById(R.id.txtJudul);
        btnStart =findViewById(R.id.btnStart);
        edtText =findViewById(R.id.edtText);

        //Inisiasi Widget ke dalam varible java agar dapat digunakan
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtHasil = findViewById(R.id.txtHasil);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isiEditTxt = edtText.getText().toString();
                hitung();
            }
        });
    }
    public void hitung(){
        //Memasukkan input Nama ari User ke dalam variable
        String isiEditxt = edtText.getText().toString();

        //memasukkan input Edit text dari User ke dalam Variable
        panjang = Integer.valueOf(edtPanjang.getText().toString());
        lebar = Integer.valueOf(edtLebar.getText().toString());

        //menghitung Luas Persegi Panjang = P * L
        hasil = panjang * lebar;

        //cetak Hasil
        txtHasil.setText("Hello. " + isiEditxt + ",Hasil luasnya adalah :" + hasil);
    }
}

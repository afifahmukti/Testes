/*
 * Copyright (c) 2017. http://hiteshsahu.com- All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * If you use or distribute this project then you MUST ADD A COPY OF LICENCE
 * along with the project.
 *  Written by Hitesh Sahu <hiteshkrsahu@Gmail.com>, 2017.
 */

package com.hitesh_sahu.retailapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hitesh_sahu.retailapp.model.entities.produkFirebase;

public class TambahActivity extends AppCompatActivity {

    private Button tambah;

    produkFirebase produk ;
    DatabaseReference dbProduk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);
        initView();

        dbProduk = FirebaseDatabase.getInstance().getReference("Produk");

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                produk = new produkFirebase("a","","","","",
                        "","","","");

                String id_produk= dbProduk.push().getKey();
                dbProduk.child(id_produk).setValue(produk);
                Toast.makeText(TambahActivity.this, "hola", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        tambah = (Button) findViewById(R.id.tambah);
    }
}

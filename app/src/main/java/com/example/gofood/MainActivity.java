package com.example.gofood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProduct;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProduct = findViewById(R.id.rv_product);
        //optimisasi ukuran
        rvProduct.setHasFixedSize(true);

        list.addAll(DataMakanan.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvProduct.setLayoutManager(new LinearLayoutManager(this));
        ListMakananAdapter listProductAdapter = new ListMakananAdapter(list);
        listProductAdapter.setContext(this);
        rvProduct.setAdapter(listProductAdapter);


    }
}

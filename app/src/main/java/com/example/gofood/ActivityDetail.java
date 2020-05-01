package com.example.gofood;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ActivityDetail extends AppCompatActivity {
    public static final String EXTRA_SPEC = "spesification";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_item);
        setTitle("Detail Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);
        TextView price = findViewById(R.id.tv_harga_makanan);

        Makanan product = getIntent().getParcelableExtra(EXTRA_SPEC);
        Glide.with(this).load(product.getPhoto()).into(imageView);
        name.setText(product.getNamaMakanan());
        description.setText(product.getDetailMakanan());
        price.setText(product.getHargaMakanan());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}

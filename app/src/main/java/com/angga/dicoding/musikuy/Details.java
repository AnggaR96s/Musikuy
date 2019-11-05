package com.angga.dicoding.musikuy;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Details extends AppCompatActivity {
    private ImageView photo;
    private TextView name, detail;
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_DETAILS = "extra_details";
    public static final String EXTRA_LINK = "extra_link";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    String nama = getIntent().getStringExtra(EXTRA_NAMA);
    String details = getIntent().getStringExtra(EXTRA_DETAILS);
    int link = getIntent().getIntExtra(EXTRA_LINK,0);
    setContentView(R.layout.item_row_music);

    photo = findViewById(R.id.img_item_photo);
    name = findViewById(R.id.tv_item_name);
    detail = findViewById(R.id.tv_item_detail);
        Glide.with(this)
                .load(link)
                .into(photo);
        name.setText(nama);
        detail.setText(details);

    }
}

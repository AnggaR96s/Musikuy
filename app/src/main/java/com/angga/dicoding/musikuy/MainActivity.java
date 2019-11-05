package com.angga.dicoding.musikuy;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    TextView teks1, teks3, teks4, teks5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button list = findViewById(R.id.btn_list);
        list.setOnClickListener((OnClickListener) this);
        Button abot = findViewById(R.id.btn_about);
        abot.setOnClickListener((OnClickListener)this);

        teks1=(TextView)findViewById(R.id.Text1);
        teks3=(TextView)findViewById(R.id.Text3);
        teks4=(TextView)findViewById(R.id.Text4);
        teks5=(TextView)findViewById(R.id.Text5);

        Typeface c1 = Typeface.createFromAsset(getAssets(),"font/Knight Brush Demo.otf");
        teks1.setTypeface(c1);

        Typeface c2 = Typeface.createFromAsset(getAssets(),"font/Knight Brush Demo.otf");
        teks1.setTypeface(c2);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_list:
                Intent moveIntent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_about:
                Intent Move= new Intent(MainActivity.this, ActivityAbout.class);
                startActivity(Move);
                break;
        }
    }
}

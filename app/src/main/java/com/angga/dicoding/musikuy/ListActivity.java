package com.angga.dicoding.musikuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private String title = "Mode List";
    private RecyclerView rvBuku;
    private ArrayList<Music> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setActionBarTitle(title);

        rvBuku = findViewById(R.id.rv_heroes);
        rvBuku.setHasFixedSize(true);



        list.addAll(MusicData.getListData());
        showRecyclerList();



    }


    private void showRecyclerList() {
        rvBuku.setLayoutManager(new LinearLayoutManager(this));
        final ListMusicAdapter listMusicAdapter = new ListMusicAdapter(list);
        rvBuku.setAdapter(listMusicAdapter);

        listMusicAdapter.setOnItemClickCallback(new ListMusicAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Music data) {
                Intent intent = new Intent(ListActivity.this, Details.class);
                intent.putExtra(Details.EXTRA_NAMA, data.getName());
                intent.putExtra(Details.EXTRA_DETAILS, data.getDetail());
                intent.putExtra(Details.EXTRA_LINK, data.getPhoto());
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedBuku(Music data) {
        Toast.makeText(this, "Kamu memilih " + data.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ListActivity.this, Details.class);
        startActivity(intent);
    }
}

package com.example.animeimpact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animeimpact.adapter.SearchAdapter;
import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    Button back_btn;
    TextView title;

    RecyclerView searchViewer;
    SearchAdapter searchAdapter;
    List<TopPicksItem> searchItemList;
    SearchView searchItem;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        back_btn = findViewById(R.id.searchBack);
        title = findViewById(R.id.searchTitle);

        searchItem = findViewById(R.id.search);
        searchItem.clearFocus();

        searchItem.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchAdapter.getFilter().filter(newText);
                return false;
            }
        });

        searchViewer = findViewById(R.id.searchView);
        searchItemList = new ArrayList<>();
        searchItemList= DataProvider.getallItems() ;
        title.setText("Search");
        setSearchViewer(searchItemList);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    private void setSearchViewer(List<TopPicksItem> dataList){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        searchViewer.setLayoutManager(layoutManager);
        searchAdapter = new SearchAdapter(this, dataList);
        searchViewer.setAdapter(searchAdapter);
    }

}

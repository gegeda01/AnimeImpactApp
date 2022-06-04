package com.example.animeimpact;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.widget.ListView;
import android.widget.SearchView;

import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animeimpact.adapter.CategoriesAdapter;
import com.example.animeimpact.adapter.TopPicksAdapter;
import com.example.animeimpact.model.CategoriesItem;
import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView topPicksViewer;
    TopPicksAdapter topPicksAdapter;
    List<TopPicksItem> topPicksItemList;

    Button searchButton;
    ConstraintLayout manga,figure,clothing;
    CategoriesAdapter categoriesAdapter;
    List<CategoriesItem> categoriesItemList;
    RecyclerView categoriesViewer;
    Button searchButton;


    @Override
    protected void onResume() {
        super.onResume();
        List<TopPicksItem> mostVisitedItems = DataProvider.getItemsOrderedByVisits();
        this.topPicksAdapter.setItems(mostVisitedItems);
        this.topPicksAdapter.notifyDataSetChanged();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topPicksViewer = findViewById(R.id.topPicksView);

        topPicksItemList = DataProvider.getItemsOrderedByVisits();


        categoriesViewer = findViewById(R.id.categoriesView);
        categoriesItemList = new ArrayList<>();
        categoriesItemList = DataProvider.generateCategories();


        setTopPicksViewer(topPicksItemList);
        categoriesViewer = findViewById(R.id.categoriesView);
        categoriesItemList = new ArrayList<>();
        categoriesItemList = DataProvider.generateCategories();
        setCategoriesViewer(categoriesItemList);

        searchButton = findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void setTopPicksViewer(List<TopPicksItem> datalist){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        topPicksViewer.setLayoutManager(layoutManager);
        topPicksAdapter = new TopPicksAdapter(this, datalist);
        topPicksViewer.setAdapter(topPicksAdapter);
    }
    private void setCategoriesViewer(List<CategoriesItem> data){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        categoriesViewer.setLayoutManager(layoutManager);
        categoriesAdapter = new CategoriesAdapter(this,data);
        categoriesViewer.setAdapter(categoriesAdapter);
    }


}
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


    //The views,array lists and buttons that is needed in the Main Activity
    RecyclerView topPicksViewer;
    TopPicksAdapter topPicksAdapter;
    List<TopPicksItem> topPicksItemList;

    Button searchButton;
    
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




    //Update the main activity everytime when main activity is resumed
    @Override
    protected void onResume() {
        super.onResume();
        List<TopPicksItem> mostViewedItems = DataProvider.getItemsOrderedByCounts();
        this.topPicksAdapter.setItems(mostViewedItems);
        this.topPicksAdapter.notifyDataSetChanged();
    }

    //Setting up the main views of the first page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting the views for the Top Picks part of the page
        topPicksViewer = findViewById(R.id.topPicksView);
        
        topPicksItemList = DataProvider.getItemsOrderedByCounts();
        setTopPicksViewer(topPicksItemList);

        //Setting the views for the Categories part of the page
        categoriesViewer = findViewById(R.id.categoriesView);
        categoriesItemList = new ArrayList<>();
        categoriesItemList = DataProvider.generateCategories();


        setTopPicksViewer(topPicksItemList);
        categoriesViewer = findViewById(R.id.categoriesView);
        categoriesItemList = new ArrayList<>();
        categoriesItemList = DataProvider.generateCategories();
        setCategoriesViewer(categoriesItemList);

        searchButton = findViewById(R.id.searchButton);
        
        setCategoriesViewer(categoriesItemList);

        //Search button that opens up a new Search Activity to search in
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

    //Method to set the TopPicks View
    private void setTopPicksViewer(List<TopPicksItem> datalist){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        topPicksViewer.setLayoutManager(layoutManager);
        topPicksAdapter = new TopPicksAdapter(this, datalist);
        topPicksViewer.setAdapter(topPicksAdapter);
    }

    //Method to set the Categories View
    private void setCategoriesViewer(List<CategoriesItem> data){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        categoriesViewer.setLayoutManager(layoutManager);
        categoriesAdapter = new CategoriesAdapter(this,data);
        categoriesViewer.setAdapter(categoriesAdapter);
    }
    
}
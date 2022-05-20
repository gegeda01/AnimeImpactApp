package com.example.animeimpact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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
    CategoriesAdapter categoriesAdapter;
    List<CategoriesItem> categoriesItemList;
    RecyclerView categoriesViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topPicksViewer = findViewById(R.id.topPicksView);
        topPicksItemList = new ArrayList<>();
        topPicksItemList.add(new TopPicksItem(R.drawable.conan_special_edition,"Special Black Edition","Detective Conan"));
        topPicksItemList.add(new TopPicksItem(R.drawable.onepiece_figure,"Ichibansho Figure","One Piece"));
        topPicksItemList.add(new TopPicksItem(R.drawable.naruto_printed_shirt,"Printed T-Shirt","Naruto"));

        categoriesViewer = findViewById(R.id.categoriesView);
        categoriesItemList = new ArrayList<>();
        categoriesItemList.add(new CategoriesItem(R.drawable.main_manga,"Manga"));
        categoriesItemList.add(new CategoriesItem(R.drawable.main_figure,"Anime Figures"));
        categoriesItemList.add(new CategoriesItem(R.drawable.main_clothing,"Clothing Store"));

        setTopPicksViewer(topPicksItemList);
        setCategoriesViewer(categoriesItemList);
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
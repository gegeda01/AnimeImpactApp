package com.example.animeimpact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView topPicksViewer;
    TopPicksAdapter topPicksAdapter;
    List<TopPicksItem> topPicksItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topPicksViewer = findViewById(R.id.topPicksView);
        topPicksItemList = new ArrayList<>();
        topPicksItemList.add(new TopPicksItem(R.drawable.conan_special_edition,"Special Black Edition","Detective Conan"));
        topPicksItemList.add(new TopPicksItem(R.drawable.onepiece_figure,"Ichibansho Figure","One Piece"));
        topPicksItemList.add(new TopPicksItem(R.drawable.clothing_naturo1,"Printed T-Shirt","Naruto"));

        setTopPicksViewer(topPicksItemList);

    }
    private void setTopPicksViewer(List<TopPicksItem> datalist){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        topPicksViewer.setLayoutManager(layoutManager);
        topPicksAdapter = new TopPicksAdapter(this, datalist);
        topPicksViewer.setAdapter(topPicksAdapter);
    }
}
package com.example.animeimpact;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animeimpact.adapter.CategoriesAdapter;
import com.example.animeimpact.adapter.ListAdapter;
import com.example.animeimpact.adapter.TopPicksAdapter;
import com.example.animeimpact.model.CategoriesItem;
import com.example.animeimpact.model.ListItem;
import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    Button btn_back;
    TextView title;
    String name;

    Button btn_ascen;
    Button btn_descen;

    RecyclerView listsViewer;
    ListAdapter listsAdapter;
    List<ListItem> listsItemList;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        btn_back = findViewById(R.id.onbtnBack);
        title = findViewById(R.id.listTitle);

        btn_ascen = findViewById(R.id.lowToHigh);
        btn_descen = findViewById(R.id.highToLow);

        name = getIntent().getStringExtra("myText");

        if(name.equals("Manga")){
            listsViewer = findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
            listsItemList= DataProvider.generateList1();
            setListsViewer(listsItemList);
        }else if(name.equals("Anime Figures")){
            listsViewer= findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
            listsItemList= DataProvider.generateList2();
            setListsViewer( listsItemList);
        }else if(name.equals("Clothing Store")){
            listsViewer= findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
            listsItemList = DataProvider.generateList3();
            setListsViewer( listsItemList);
        }


        title.setText(name);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_ascen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.sort(listsItemList,ListItem.PriceLowToHigh);
                listsAdapter.notifyDataSetChanged();

            }
        });

        btn_descen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.sort(listsItemList,ListItem.PriceHighToLow);
                listsAdapter.notifyDataSetChanged();
            }
        });
    }



    private void setListsViewer(List<ListItem> datalist){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        listsViewer.setLayoutManager(layoutManager);
        listsAdapter = new ListAdapter(this, datalist);
        listsViewer.setAdapter(listsAdapter);
    }



}

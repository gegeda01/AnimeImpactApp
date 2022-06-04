package com.example.animeimpact;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< Updated upstream
=======
import android.telecom.Call;
>>>>>>> Stashed changes
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
<<<<<<< HEAD
=======
import android.widget.Toast;
import android.widget.Toolbar;
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animeimpact.adapter.ListAdapter;
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
<<<<<<< HEAD
    List<TopPicksItem> listsItemList;
=======
    List<ListItem> listsItemList;
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        btn_back = findViewById(R.id.onbtnBack);
        title = findViewById(R.id.listTitle);

        btn_ascen = findViewById(R.id.lowToHigh);
        btn_descen = findViewById(R.id.highToLow);

        name = getIntent().getStringExtra("myText");


        if(name.equals("MANGA")){
            listsViewer = findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
<<<<<<< Updated upstream
            listsItemList= DataProvider.generateList1();
=======
<<<<<<< HEAD
            listsItemList=getActivityItems("MANGA");
=======
            listsItemList= DataProvider.generateList1();
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
            setListsViewer(listsItemList);
        }else if(name.equals("FIGURES")){
            listsViewer= findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
            listsItemList=getActivityItems("FIGURES");
            setListsViewer( listsItemList);
        }else if(name.equals("CLOTHINGS")){
            listsViewer= findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
            listsItemList=getActivityItems("CLOTHINGS");
=======
>>>>>>> Stashed changes
            listsItemList= DataProvider.generateList2();
            setListsViewer( listsItemList);
        }else if(name.equals("Clothing Store")){
            listsViewer= findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
            listsItemList = DataProvider.generateList3();
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
            setListsViewer( listsItemList);
        }


        title.setText(name);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

<<<<<<< Updated upstream
        btn_ascen.setOnClickListener(new View.OnClickListener() {
=======
<<<<<<< HEAD
        /*btn_ascen.setOnClickListener(new View.OnClickListener() {
=======
        btn_ascen.setOnClickListener(new View.OnClickListener() {
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        });
=======
<<<<<<< HEAD
        });*/
=======
        });
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
    }



<<<<<<< Updated upstream
=======
<<<<<<< HEAD
    private void setListsViewer(List<TopPicksItem> datalist){
=======
>>>>>>> Stashed changes
    private void setListsViewer(List<ListItem> datalist){
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        listsViewer.setLayoutManager(layoutManager);
        listsAdapter = new ListAdapter(this, datalist);
        listsViewer.setAdapter(listsAdapter);
    }

    public List<TopPicksItem> getActivityItems(String categoryName) {
        List<TopPicksItem> items = DataProvider.getallItems();
        List<TopPicksItem> categoryItems = new ArrayList<>();

        for (TopPicksItem item : items) {

            if (item.getType().equals(categoryName)) {
                categoryItems.add(item);
            }
        }
        return categoryItems;
    }


}

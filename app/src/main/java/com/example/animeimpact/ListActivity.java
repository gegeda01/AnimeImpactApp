package com.example.animeimpact;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animeimpact.adapter.ListAdapter;
import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    //The views and array lists that is needed in the List Activity
    TextView title;
    String name;
    RecyclerView listsViewer;
    ListAdapter listsAdapter;
    List<TopPicksItem> listsItemList;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        title = findViewById(R.id.listTitle);
        //Receive the information passed from the adapter
        name = getIntent().getStringExtra("myText");

        //Toolbar that is needed for the sorting method, and also to return to MainActivity
        Toolbar tb = findViewById(R.id.toolBar);
        setSupportActionBar(tb);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //Getting the Name of the category that is pressed, and then put up the relevant Lists
        //that is needed for that specific category
        if(name.equals("MANGA")){
            listsViewer = findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
            listsItemList=getActivityItems("MANGA");
            setListsViewer(listsItemList);
        }else if(name.equals("FIGURES")){
            listsViewer= findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
            listsItemList=getActivityItems("FIGURES");
            setListsViewer( listsItemList);
        }else if(name.equals("CLOTHINGS")){
            listsViewer= findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
            listsItemList=getActivityItems("CLOTHINGS");
            setListsViewer( listsItemList);
        }

        //Setting the title to the category name
        title.setText(name);

    }

    //Set up the menu for the toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sort,menu);
        return true;
    }

    //Implement the sorting methods and assigned the options in the menu with these functionalities
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.sort1:
                Collections.sort(listsItemList,TopPicksItem.lowToHighSorter);
                listsAdapter.notifyDataSetChanged();
                return true;
            case R.id.sort2:
                Collections.sort(listsItemList,TopPicksItem.highToLowSorter);
                listsAdapter.notifyDataSetChanged();
                return true;
            case R.id.sort3:
                Collections.sort(listsItemList,TopPicksItem.azSorter);
                listsAdapter.notifyDataSetChanged();
                return true;
            case R.id.sort4:
                Collections.sort(listsItemList,TopPicksItem.zaSorter);
                listsAdapter.notifyDataSetChanged();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    //Setting the layout for the ListViewer using Recycler View
    private void setListsViewer(List<TopPicksItem> datalist){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        listsViewer.setLayoutManager(layoutManager);
        listsAdapter = new ListAdapter(this, datalist);
        listsViewer.setAdapter(listsAdapter);
    }

    //Sort all the items by their category
    public List<TopPicksItem> getActivityItems(String categoryName) {
        List<TopPicksItem> items = DataProvider.getallItems();
        List<TopPicksItem> categoryItems = new ArrayList<TopPicksItem>();

        for (TopPicksItem item : items) {

            if (item.getType().equals(categoryName)) {
                categoryItems.add(item);
            }
        }
        return categoryItems;
    }


}

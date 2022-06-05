package com.example.animeimpact;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animeimpact.adapter.SearchAdapter;
import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;

import java.util.Collections;
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

        //Layouts and buttons that will be used in this class
        title = findViewById(R.id.searchTitle);
        searchItem = findViewById(R.id.search);
        searchItem.clearFocus();
        Button back_btn;
        back_btn = findViewById(R.id.searchBack);


        //The toolbar needed at the top of the SearchPage for Back and Drop down menu for Sorting
        Toolbar tb = findViewById(R.id.toolSearchBar);
        setSupportActionBar(tb);
        getSupportActionBar().setTitle(null);


        //Setting the SearchView to be clickable, and once clicked, call Filter method to obtain
        //what the user has inputted
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
        

        //Setting the Recycler View for the entire list
        searchViewer = findViewById(R.id.searchView);
        searchItemList = new ArrayList<>();
        searchItemList= DataProvider.getallItems();
        setSearchViewer(searchItemList);


        //Back button to return to main menu after click
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }

    

    //Setting the view of Search Page, using Recycler view
    private void setSearchViewer(List<TopPicksItem> dataList){

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        searchViewer.setLayoutManager(layoutManager);
        searchAdapter = new SearchAdapter(this, dataList);
        searchViewer.setAdapter(searchAdapter);
    }


    //Creating the Menu for Sorting method
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sort,menu);
        return true;


    }

    //Implement the sorting methods and assigned the options in the menu with these functionalities
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.sort1:
                Collections.sort(searchItemList,TopPicksItem.lowToHighSorter);
                searchAdapter.notifyDataSetChanged();
                return true;
            case R.id.sort2:
                Collections.sort(searchItemList,TopPicksItem.highToLowSorter);
                searchAdapter.notifyDataSetChanged();
                return true;
            case R.id.sort3:
                Collections.sort(searchItemList,TopPicksItem.azSorter);
                searchAdapter.notifyDataSetChanged();
                return true;
            case R.id.sort4:
                Collections.sort(searchItemList,TopPicksItem.zaSorter);
                searchAdapter.notifyDataSetChanged();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

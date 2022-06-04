package com.example.animeimpact;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
=======
>>>>>>> Stashed changes
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
import com.example.animeimpact.adapter.SearchAdapter;
import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> Stashed changes
import com.example.animeimpact.adapter.ListAdapter;
import com.example.animeimpact.adapter.SearchAdapter;
import com.example.animeimpact.model.ListItem;
import com.example.animeimpact.model.SearchItem;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes

public class SearchActivity extends AppCompatActivity {
    Button back_btn;
    TextView title;

    RecyclerView searchViewer;
    SearchAdapter searchAdapter;
<<<<<<< Updated upstream
    List<SearchItem> searchItemList;
=======
<<<<<<< HEAD
    List<TopPicksItem> searchItemList;
=======
    List<SearchItem> searchItemList;
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        searchItemList= DataProvider.generateSearchList();
=======
<<<<<<< HEAD
        searchItemList= DataProvider.getallItems() ;
=======
        searchItemList= DataProvider.generateSearchList();
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
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


<<<<<<< Updated upstream
    private void setSearchViewer(List<SearchItem> dataList){
=======
<<<<<<< HEAD
    private void setSearchViewer(List<TopPicksItem> dataList){
=======
    private void setSearchViewer(List<SearchItem> dataList){
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        searchViewer.setLayoutManager(layoutManager);
        searchAdapter = new SearchAdapter(this, dataList);
        searchViewer.setAdapter(searchAdapter);
    }
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
}

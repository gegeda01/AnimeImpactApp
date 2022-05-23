package com.example.animeimpact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
import java.util.List;

public class ListActivity extends AppCompatActivity {


    Button btn_back;
    TextView title;
    String name;

    RecyclerView listsViewer;
    ListAdapter listsAdapter;
    List<ListItem> listsItemList;
    List<ListItem> listItemList2;
    List<ListItem> listItemList3;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        btn_back = findViewById(R.id.onbtnBack);
        title = findViewById(R.id.listTitle);

        name = getIntent().getStringExtra("myText");

        if(name.equals("Manga")){
            listsViewer = findViewById(R.id.listView);
            listsItemList = new ArrayList<>();
            listsItemList.add(new ListItem("One Piece","Volume 9","$19.99",R.drawable.onepiece1_volume9));
            listsItemList.add(new ListItem("Detective Conan","Volume 64","$29.99",R.drawable.conan1_volume61));
            listsItemList.add(new ListItem("JOJO","Volume 02","$39.99",R.drawable.jojos1_volume2));
            listsItemList.add(new ListItem("Naruto","Volume 26","$29.99",R.drawable.naruto1_volume6));
            listsItemList.add(new ListItem("Demon Slayer","Volume 03","$29.99",R.drawable.demonslayer1_volume3));
            listsItemList.add(new ListItem("Demon Slayer","Volume 04","$29.99",R.drawable.demonslayer1_volume4));
            listsItemList.add(new ListItem("One Piece","Volume 97","$19.99",R.drawable.onepiece_volume97));
            listsItemList.add(new ListItem("Detective Conan","Special Black Edition","$39.99",R.drawable.conan_special_edition));
            listsItemList.add(new ListItem("Naruto","Volume 03","$29.99",R.drawable.naruto_volume3));
            setListsViewer(listsItemList);
        }else if(name.equals("Anime Figures")){
            listsViewer= findViewById(R.id.listView);
            listItemList2 = new ArrayList<>();
            listItemList2.add(new ListItem("One Piece","","$69.99",R.drawable.onepiece_figure));
            listItemList2.add(new ListItem("Detective Conan","","$49.99",R.drawable.conan2_kaito_figure));
            listItemList2.add(new ListItem("Detective Conan","","$49.99",R.drawable.conan2_small_figure));
            listItemList2.add(new ListItem("One Piece","","$59.99",R.drawable.onepiece_figure2));
            listItemList2.add(new ListItem("Slayer Demon","","$49.99",R.drawable.slayer_figure1));
            listItemList2.add(new ListItem("Slayer Demon","","$49.99",R.drawable.slayer_figure2));
            listItemList2.add(new ListItem("JoJo","","$49.99",R.drawable.jojo_figure1));
            listItemList2.add(new ListItem("JoJo","","$49.99",R.drawable.jojo_figure2));
            listItemList2.add(new ListItem("Naruto","","$49.99",R.drawable.naruto_figure1));
            listItemList2.add(new ListItem("Naruto","","$49.99",R.drawable.naruto_figure2));
            setListsViewer(listItemList2);
        }else if(name.equals("Clothing Store")){
            listsViewer= findViewById(R.id.listView);
            listItemList3 = new ArrayList<>();
            listItemList3.add(new ListItem("One Piece","","$19.99",R.drawable.onepiece_clothing1));
            listItemList3.add(new ListItem("One Piece","","$19.99",R.drawable.onepiece_clothing2));
            listItemList3.add(new ListItem("Detective Conan","","$19.99",R.drawable.conan3_shirt));
            listItemList3.add(new ListItem("Detective Conan","","$19.99",R.drawable.conan3_beanie));
            listItemList3.add(new ListItem("JoJo","","$19.99",R.drawable.jojo_clothing1));
            listItemList3.add(new ListItem("JoJo","","$19.99",R.drawable.jojo_clothing2));
            listItemList3.add(new ListItem("Naruto","","$19.99",R.drawable.naruto_printed_shirt));
            listItemList3.add(new ListItem("Naruto","","$19.99",R.drawable.naruto_clothing2));
            listItemList3.add(new ListItem("Slayer Demon","","$19.99",R.drawable.slayer_clothing2));
            listItemList3.add(new ListItem("Slayer Demon","","$19.99",R.drawable.slayer_clothing1));
            setListsViewer(listItemList3);
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
    }

    private void setListsViewer(List<ListItem> datalist){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        listsViewer.setLayoutManager(layoutManager);
        listsAdapter = new ListAdapter(this, datalist);
        listsViewer.setAdapter(listsAdapter);
    }



}

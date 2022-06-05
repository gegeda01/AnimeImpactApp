package com.example.animeimpact;


import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.animeimpact.adapter.ImageAdapter;
import com.example.animeimpact.model.TopPicksItem;
import java.io.Serializable;

import java.util.ArrayList;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {



    Button btn_buy;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        //Receive the information from the adapter
        Intent intent = getIntent();
        TopPicksItem item = (TopPicksItem) intent.getSerializableExtra("id");
        btn_buy = findViewById(R.id.buyButton);

        //Viewpager(image slider) for the individual images at the top of Details Activity
        ViewPager viewpager=findViewById(R.id.itemImage);
        ImageAdapter imageAdapter = new ImageAdapter(item.getImageset(),this);
        viewpager.setAdapter(imageAdapter);

        //Setting the views for the item descriptions
        TextView price = findViewById(R.id.itemPrice);
        price.setText("$"+String.valueOf(item.getPrice()));
        TextView itemName = findViewById(R.id.itemName);
        itemName.setText(item.getdescription());
        TextView details = findViewById(R.id.itemDetails);
        details.setText(item.getname());
        TextView description = findViewById(R.id.itemDescription);
        description.setText(item.getInfo());

        //Allowing to buy if the button is pressed
        btn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailsActivity.this,"This item has been purchased",Toast.LENGTH_SHORT).show();
            }
        });


    }


}

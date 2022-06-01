package com.example.animeimpact;


import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import java.util.ArrayList;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    Button btn_back;
    String name, volume;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        btn_back = findViewById(R.id.DetailBtnBack);

        ImageSlider image = findViewById(R.id.itemImage);
        TextView price = findViewById(R.id.itemPrice);
        TextView itemName = findViewById(R.id.itemName);
        TextView details = findViewById(R.id.itemDetails);
        TextView description = findViewById(R.id.itemDescription);

        name = getIntent().getStringExtra("name");
        volume = getIntent().getStringExtra("volume");

        if(name.equals("One Piece") && volume.equals("Volume 9")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op111, null));
            imageSet.add(new SlideModel(R.drawable.op112, null));
            imageSet.add(new SlideModel(R.drawable.op113, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("One Piece") && volume.equals("Volume 97")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op121, null));
            imageSet.add(new SlideModel(R.drawable.op122, null));
            imageSet.add(new SlideModel(R.drawable.op123, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Detective Conan") && volume.equals("Volume 61")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc111, null));
            imageSet.add(new SlideModel(R.drawable.dc112, null));
            imageSet.add(new SlideModel(R.drawable.dc113, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Detective Conan") && volume.equals("Special Black Edition")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc121, null));
            imageSet.add(new SlideModel(R.drawable.dc122, null));
            imageSet.add(new SlideModel(R.drawable.dc123, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Demon Slayer") && volume.equals("Volume 3")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds111, null));
            imageSet.add(new SlideModel(R.drawable.ds112, null));
            imageSet.add(new SlideModel(R.drawable.ds113, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Demon Slayer") && volume.equals("Volume 4")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds121, null));
            imageSet.add(new SlideModel(R.drawable.ds122, null));
            imageSet.add(new SlideModel(R.drawable.ds123, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("JoJo") && volume.equals("Volume 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj111, null));
            imageSet.add(new SlideModel(R.drawable.jj112, null));
            imageSet.add(new SlideModel(R.drawable.jj113, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("JoJo") && volume.equals("Volume 27")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj121, null));
            imageSet.add(new SlideModel(R.drawable.jj122, null));
            imageSet.add(new SlideModel(R.drawable.jj123, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Naruto") && volume.equals("Volume 6")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n111, null));
            imageSet.add(new SlideModel(R.drawable.n112, null));
            imageSet.add(new SlideModel(R.drawable.n113, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Naruto") && volume.equals("Volume 3")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n121, null));
            imageSet.add(new SlideModel(R.drawable.n122, null));
            imageSet.add(new SlideModel(R.drawable.n123, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("One Piece") && volume.equals("Figure 1")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op211, null));
            imageSet.add(new SlideModel(R.drawable.op212, null));
            imageSet.add(new SlideModel(R.drawable.op213, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("One Piece") && volume.equals("Figure 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op221, null));
            imageSet.add(new SlideModel(R.drawable.op222, null));
            imageSet.add(new SlideModel(R.drawable.op223, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Detective Conan") && volume.equals("Figure 1")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc211, null));
            imageSet.add(new SlideModel(R.drawable.dc212, null));
            imageSet.add(new SlideModel(R.drawable.dc213, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Detective Conan") && volume.equals("Figure 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc221, null));
            imageSet.add(new SlideModel(R.drawable.dc222, null));
            imageSet.add(new SlideModel(R.drawable.dc223, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Demon Slayer") && volume.equals("Figure 1")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds211, null));
            imageSet.add(new SlideModel(R.drawable.ds212, null));
            imageSet.add(new SlideModel(R.drawable.ds213, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Demon Slayer") && volume.equals("Figure 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds221, null));
            imageSet.add(new SlideModel(R.drawable.ds222, null));
            imageSet.add(new SlideModel(R.drawable.ds223, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("JoJo") && volume.equals("Figure 1")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj211, null));
            imageSet.add(new SlideModel(R.drawable.jj212, null));
            imageSet.add(new SlideModel(R.drawable.jj213, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("JoJo") && volume.equals("Figure 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj221, null));
            imageSet.add(new SlideModel(R.drawable.jj222, null));
            imageSet.add(new SlideModel(R.drawable.jj223, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Naruto") && volume.equals("Figure 1")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n211, null));
            imageSet.add(new SlideModel(R.drawable.n212, null));
            imageSet.add(new SlideModel(R.drawable.n213, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Naruto") && volume.equals("Figure 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n221, null));
            imageSet.add(new SlideModel(R.drawable.n222, null));
            imageSet.add(new SlideModel(R.drawable.n223, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("One Piece") && volume.equals("T shirt")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op311, null));
            imageSet.add(new SlideModel(R.drawable.op312, null));
            imageSet.add(new SlideModel(R.drawable.op313, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("One Piece") && volume.equals("Hat")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op321, null));
            imageSet.add(new SlideModel(R.drawable.op322, null));
            imageSet.add(new SlideModel(R.drawable.op323, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Detective Conan") && volume.equals("T shirt")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc311, null));
            imageSet.add(new SlideModel(R.drawable.dc312, null));
            imageSet.add(new SlideModel(R.drawable.dc313, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Detective Conan") && volume.equals("Beanie")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc321, null));
            imageSet.add(new SlideModel(R.drawable.dc322, null));
            imageSet.add(new SlideModel(R.drawable.dc323, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Demon Slayer") && volume.equals("Cosplay")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds311, null));
            imageSet.add(new SlideModel(R.drawable.ds312, null));
            imageSet.add(new SlideModel(R.drawable.ds313, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Demon Slayer") && volume.equals("Fox Cosplay")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds321, null));
            imageSet.add(new SlideModel(R.drawable.ds322, null));
            imageSet.add(new SlideModel(R.drawable.ds323, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("JoJo") && volume.equals("T shirt")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj311, null));
            imageSet.add(new SlideModel(R.drawable.jj312, null));
            imageSet.add(new SlideModel(R.drawable.jj313, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("JoJo") && volume.equals("Hoodie")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj321, null));
            imageSet.add(new SlideModel(R.drawable.jj322, null));
            imageSet.add(new SlideModel(R.drawable.jj323, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Naruto") && volume.equals("T shirt")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n311, null));
            imageSet.add(new SlideModel(R.drawable.n312, null));
            imageSet.add(new SlideModel(R.drawable.n313, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Naruto") && volume.equals("Hoodie")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n321, null));
            imageSet.add(new SlideModel(R.drawable.n322, null));
            imageSet.add(new SlideModel(R.drawable.n323, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        }




        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailsActivity.this, ListActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}

package com.example.animeimpact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class TopPicksDetailActivity extends AppCompatActivity {

    Button btn_back;
    String info, title;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        btn_back = findViewById(R.id.DetailBtnBack);

        ImageSlider image = findViewById(R.id.itemImage);
        TextView price = findViewById(R.id.itemPrice);
        TextView itemName = findViewById(R.id.itemName);
        TextView details = findViewById(R.id.itemDetails);
        TextView description = findViewById(R.id.itemDescription);

        info = getIntent().getStringExtra("info");
        title = getIntent().getStringExtra("title");

        if(title.equals("Detective Conan") && info.equals("Special Black Edition")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc121, null));
            imageSet.add(new SlideModel(R.drawable.dc122, null));
            imageSet.add(new SlideModel(R.drawable.dc123, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (title.equals("One Piece") && info.equals("Ichibansho Figure")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op211, null));
            imageSet.add(new SlideModel(R.drawable.op212, null));
            imageSet.add(new SlideModel(R.drawable.op213, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (title.equals("Naruto") && info.equals("Printed T-Shirt")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op311, null));
            imageSet.add(new SlideModel(R.drawable.op312, null));
            imageSet.add(new SlideModel(R.drawable.op313, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (title.equals("Demon Slayer") && info.equals("Cosplay")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds311, null));
            imageSet.add(new SlideModel(R.drawable.ds312, null));
            imageSet.add(new SlideModel(R.drawable.ds313, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (title.equals("JoJo") && info.equals("Manga volume 27")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj121, null));
            imageSet.add(new SlideModel(R.drawable.jj122, null));
            imageSet.add(new SlideModel(R.drawable.jj123, null));
            image.setImageList(imageSet);
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        }


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TopPicksDetailActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

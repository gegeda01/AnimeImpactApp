package com.example.animeimpact;


import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.animeimpact.adapter.ImageAdapter;
import com.example.animeimpact.model.TopPicksItem;
import java.io.Serializable;

=======
>>>>>>> Stashed changes
<<<<<<< Updated upstream
=======
import android.widget.Toast;
>>>>>>> Stashed changes

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
import java.util.ArrayList;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
    Button btn_buy;

=======
>>>>>>> Stashed changes
<<<<<<< Updated upstream
    Button btn_back;
=======
    Button btn_back,btn_buy;
>>>>>>> Stashed changes
    String name, volume;
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
        Intent intent = getIntent();
        TopPicksItem item = (TopPicksItem) intent.getSerializableExtra("id");
        btn_buy = findViewById(R.id.buyButton);

        ViewPager viewpager=findViewById(R.id.itemImage);
        ImageAdapter imageAdapter = new ImageAdapter(item.getImageset(),this);
        viewpager.setAdapter(imageAdapter);

        TextView price = findViewById(R.id.itemPrice);
        price.setText("$"+String.valueOf(item.getPrice()));
        TextView itemName = findViewById(R.id.itemName);
        itemName.setText(item.getdescription());
        TextView details = findViewById(R.id.itemDetails);
        details.setText(item.getname());
        TextView description = findViewById(R.id.itemDescription);
        description.setText(item.getInfo());

=======
>>>>>>> Stashed changes

        btn_back = findViewById(R.id.DetailBtnBack);
<<<<<<< Updated upstream
=======
        btn_buy = findViewById(R.id.buyButton);
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$19");
            itemName.setText("One Piece");
            details.setText("Volume 9");
            description.setText("One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("One Piece") && volume.equals("Volume 97")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op121, null));
            imageSet.add(new SlideModel(R.drawable.op122, null));
            imageSet.add(new SlideModel(R.drawable.op123, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$19");
            itemName.setText("One Piece");
            details.setText("Volume 97");
            description.setText("One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("Detective Conan") && volume.equals("Volume 61")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc111, null));
            imageSet.add(new SlideModel(R.drawable.dc112, null));
            imageSet.add(new SlideModel(R.drawable.dc113, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        } else if (name.equals("Detective Conan") && volume.equals("Special Black Edition")) {
=======
            price.setText("$29");
            itemName.setText("Detective Conan");
            details.setText("Volume 61");
            description.setText("Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022.");
        } else if (name.equals("Detective Conan") && volume.equals("Special Edition")) {
>>>>>>> Stashed changes
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc121, null));
            imageSet.add(new SlideModel(R.drawable.dc122, null));
            imageSet.add(new SlideModel(R.drawable.dc123, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$39");
            itemName.setText("Detective Conan");
            details.setText("Special Edition");
            description.setText("Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("Demon Slayer") && volume.equals("Volume 3")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds111, null));
            imageSet.add(new SlideModel(R.drawable.ds112, null));
            imageSet.add(new SlideModel(R.drawable.ds113, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$29");
            itemName.setText("Demon Slayer");
            details.setText("Volume 3");
            description.setText("Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon.");
>>>>>>> Stashed changes
        } else if (name.equals("Demon Slayer") && volume.equals("Volume 4")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds121, null));
            imageSet.add(new SlideModel(R.drawable.ds122, null));
            imageSet.add(new SlideModel(R.drawable.ds123, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$29");
            itemName.setText("Demon Slayer");
            details.setText("Volume 4");
            description.setText("Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon.");
>>>>>>> Stashed changes
        } else if (name.equals("JoJo") && volume.equals("Volume 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj111, null));
            imageSet.add(new SlideModel(R.drawable.jj112, null));
            imageSet.add(new SlideModel(R.drawable.jj113, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$39");
            itemName.setText("JoJo's");
            details.setText("Volume 2");
            description.setText("JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005.");
>>>>>>> Stashed changes
        } else if (name.equals("JoJo") && volume.equals("Volume 27")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj121, null));
            imageSet.add(new SlideModel(R.drawable.jj122, null));
            imageSet.add(new SlideModel(R.drawable.jj123, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$39");
            itemName.setText("JoJo's");
            details.setText("Volume 27");
            description.setText("JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005.");
>>>>>>> Stashed changes
        } else if (name.equals("Naruto") && volume.equals("Volume 6")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n111, null));
            imageSet.add(new SlideModel(R.drawable.n112, null));
            imageSet.add(new SlideModel(R.drawable.n113, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$29");
            itemName.setText("Naruto");
            details.setText("Volume 6");
            description.setText("Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village.");
>>>>>>> Stashed changes
        } else if (name.equals("Naruto") && volume.equals("Volume 3")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n121, null));
            imageSet.add(new SlideModel(R.drawable.n122, null));
            imageSet.add(new SlideModel(R.drawable.n123, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$29");
            itemName.setText("Naruto");
            details.setText("Volume 3");
            description.setText("Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village.");
>>>>>>> Stashed changes
        } else if (name.equals("One Piece") && volume.equals("Figure 1")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op211, null));
            imageSet.add(new SlideModel(R.drawable.op212, null));
            imageSet.add(new SlideModel(R.drawable.op213, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$69");
            itemName.setText("One Piece");
            details.setText("Figure 1");
            description.setText("One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("One Piece") && volume.equals("Figure 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op221, null));
            imageSet.add(new SlideModel(R.drawable.op222, null));
            imageSet.add(new SlideModel(R.drawable.op223, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$59");
            itemName.setText("One Piece");
            details.setText("Figure 2");
            description.setText("One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("Detective Conan") && volume.equals("Figure 1")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc211, null));
            imageSet.add(new SlideModel(R.drawable.dc212, null));
            imageSet.add(new SlideModel(R.drawable.dc213, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$49");
            itemName.setText("Detective Conan");
            details.setText("Figure 1");
            description.setText("Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("Detective Conan") && volume.equals("Figure 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc221, null));
            imageSet.add(new SlideModel(R.drawable.dc222, null));
            imageSet.add(new SlideModel(R.drawable.dc223, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$49");
            itemName.setText("Detective Conan");
            details.setText("Figure 2");
            description.setText("Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("Demon Slayer") && volume.equals("Figure 1")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds211, null));
            imageSet.add(new SlideModel(R.drawable.ds212, null));
            imageSet.add(new SlideModel(R.drawable.ds213, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$59");
            itemName.setText("Demon Slayer");
            details.setText("Figure 1");
            description.setText("Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon.");
>>>>>>> Stashed changes
        } else if (name.equals("Demon Slayer") && volume.equals("Figure 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds221, null));
            imageSet.add(new SlideModel(R.drawable.ds222, null));
            imageSet.add(new SlideModel(R.drawable.ds223, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$49");
            itemName.setText("Demon Slayer");
            details.setText("Figure 2");
            description.setText("Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon.");
>>>>>>> Stashed changes
        } else if (name.equals("JoJo") && volume.equals("Figure 1")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj211, null));
            imageSet.add(new SlideModel(R.drawable.jj212, null));
            imageSet.add(new SlideModel(R.drawable.jj213, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$49");
            itemName.setText("JoJo's");
            details.setText("Figure 1");
            description.setText("JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. ");
>>>>>>> Stashed changes
        } else if (name.equals("JoJo") && volume.equals("Figure 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj221, null));
            imageSet.add(new SlideModel(R.drawable.jj222, null));
            imageSet.add(new SlideModel(R.drawable.jj223, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$49");
            itemName.setText("JoJo's");
            details.setText("Figure 2");
            description.setText("JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. ");
>>>>>>> Stashed changes
        } else if (name.equals("Naruto") && volume.equals("Figure 1")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n211, null));
            imageSet.add(new SlideModel(R.drawable.n212, null));
            imageSet.add(new SlideModel(R.drawable.n213, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$49");
            itemName.setText("Naruto");
            details.setText("Figure 1");
            description.setText("Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village.");
>>>>>>> Stashed changes
        } else if (name.equals("Naruto") && volume.equals("Figure 2")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n221, null));
            imageSet.add(new SlideModel(R.drawable.n222, null));
            imageSet.add(new SlideModel(R.drawable.n223, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$49");
            itemName.setText("Naruto");
            details.setText("Figure 2");
            description.setText("Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village.");
>>>>>>> Stashed changes
        } else if (name.equals("One Piece") && volume.equals("T shirt")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op311, null));
            imageSet.add(new SlideModel(R.drawable.op312, null));
            imageSet.add(new SlideModel(R.drawable.op313, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$29");
            itemName.setText("One Piece");
            details.setText("T-Shirt");
            description.setText("One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("One Piece") && volume.equals("Hat")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.op321, null));
            imageSet.add(new SlideModel(R.drawable.op322, null));
            imageSet.add(new SlideModel(R.drawable.op323, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$19");
            itemName.setText("One Piece");
            details.setText("Hat");
            description.setText("One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("Detective Conan") && volume.equals("T shirt")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc311, null));
            imageSet.add(new SlideModel(R.drawable.dc312, null));
            imageSet.add(new SlideModel(R.drawable.dc313, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$25");
            itemName.setText("Detective Conan");
            details.setText("T-Shirt");
            description.setText("Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("Detective Conan") && volume.equals("Beanie")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.dc321, null));
            imageSet.add(new SlideModel(R.drawable.dc322, null));
            imageSet.add(new SlideModel(R.drawable.dc323, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$19");
            itemName.setText("Detective Conan");
            details.setText("Beanie");
            description.setText("Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022.");
>>>>>>> Stashed changes
        } else if (name.equals("Demon Slayer") && volume.equals("Cosplay")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds311, null));
            imageSet.add(new SlideModel(R.drawable.ds312, null));
            imageSet.add(new SlideModel(R.drawable.ds313, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$49");
            itemName.setText("Demon Slayer");
            details.setText("Cosplay");
            description.setText("Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon.");
>>>>>>> Stashed changes
        } else if (name.equals("Demon Slayer") && volume.equals("Fox Cosplay")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.ds321, null));
            imageSet.add(new SlideModel(R.drawable.ds322, null));
            imageSet.add(new SlideModel(R.drawable.ds323, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$69");
            itemName.setText("Demon Slayer");
            details.setText("Fox Cosplay");
            description.setText("Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon.");
>>>>>>> Stashed changes
        } else if (name.equals("JoJo") && volume.equals("T shirt")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj311, null));
            imageSet.add(new SlideModel(R.drawable.jj312, null));
            imageSet.add(new SlideModel(R.drawable.jj313, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$19");
            itemName.setText("JoJo's");
            details.setText("T-Shirt");
            description.setText("JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. ");
>>>>>>> Stashed changes
        } else if (name.equals("JoJo") && volume.equals("Hoodie")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.jj321, null));
            imageSet.add(new SlideModel(R.drawable.jj322, null));
            imageSet.add(new SlideModel(R.drawable.jj323, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$29");
            itemName.setText("JoJo's");
            details.setText("Hoodie");
            description.setText("JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. ");
>>>>>>> Stashed changes
        } else if (name.equals("Naruto") && volume.equals("T shirt")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n311, null));
            imageSet.add(new SlideModel(R.drawable.n312, null));
            imageSet.add(new SlideModel(R.drawable.n313, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
=======
            price.setText("$19");
            itemName.setText("Naruto");
            details.setText("T-Shirt");
            description.setText("Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village.");
>>>>>>> Stashed changes
        } else if (name.equals("Naruto") && volume.equals("Hoodie")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n321, null));
            imageSet.add(new SlideModel(R.drawable.n322, null));
            imageSet.add(new SlideModel(R.drawable.n323, null));
            image.setImageList(imageSet);
<<<<<<< Updated upstream
            price.setText("");
            itemName.setText("");
            details.setText("");
            description.setText("");
        }


=======
            price.setText("$29");
            itemName.setText("Naruto");
            details.setText("Hoodie");
            description.setText("Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village.");
        }
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes

        btn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailsActivity.this,"This item has been purchased",Toast.LENGTH_SHORT).show();
            }
        });
<<<<<<< Updated upstream
=======
<<<<<<< HEAD



=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailsActivity.this, ListActivity.class);
                startActivity(intent);
                finish();
            }
        });
<<<<<<< Updated upstream
=======


>>>>>>> Stashed changes
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
    }


}

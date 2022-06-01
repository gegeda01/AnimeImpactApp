package com.example.animeimpact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
<<<<<<< Updated upstream
=======
import android.widget.Toast;
>>>>>>> Stashed changes

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class TopPicksDetailActivity extends AppCompatActivity {

<<<<<<< Updated upstream
    Button btn_back;
=======
    Button btn_back,btn_buy;
>>>>>>> Stashed changes
    String info, title;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

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

        info = getIntent().getStringExtra("info");
        title = getIntent().getStringExtra("title");

<<<<<<< Updated upstream
        if(title.equals("Detective Conan") && info.equals("Special Black Edition")) {
=======
        if(title.equals("Detective Conan") && info.equals("Special Edition")) {
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
        } else if (title.equals("One Piece") && info.equals("Ichibansho Figure")) {
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
=======
            price.setText("$69");
            itemName.setText("One Piece");
            details.setText("Figure 1");
            description.setText("One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022.");
        } else if (title.equals("Naruto") && info.equals("Printed T-Shirt")) {
            ArrayList<SlideModel> imageSet = new ArrayList<>();
            imageSet.add(new SlideModel(R.drawable.n311, null));
            imageSet.add(new SlideModel(R.drawable.n312, null));
            imageSet.add(new SlideModel(R.drawable.n313, null));
            image.setImageList(imageSet);
            price.setText("$19");
            itemName.setText("Naruto");
            details.setText("T-Shirt");
            description.setText("Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village.");
>>>>>>> Stashed changes
        } else if (title.equals("Demon Slayer") && info.equals("Cosplay")) {
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
        } else if (title.equals("JoJo") && info.equals("Manga volume 27")) {
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
        }


=======
            price.setText("$39");
            itemName.setText("JoJo's");
            details.setText("Volume 27");
            description.setText("JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. ");
        }

        btn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TopPicksDetailActivity.this,"This item has been purchased",Toast.LENGTH_SHORT).show();
            }
        });
>>>>>>> Stashed changes
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

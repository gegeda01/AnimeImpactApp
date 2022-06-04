package com.example.animeimpact;

import com.example.animeimpact.model.CategoriesItem;

import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {
    public static final Map<TopPicksItem, Integer> totalItems = new LinkedHashMap<>();

    static {
        TopPicksItem t1 = new TopPicksItem(R.drawable.dc111,"Special Edition","Detective Conan","MANGA"
        ,39,"Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022."
        ,new ArrayList<>(Arrays.asList("dc111","dc112","dc113")));
        TopPicksItem t2 = new TopPicksItem(R.drawable.op211,"Ichibansho Figure","One Piece","FIGURES",
        69,"One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("op211","op212","op213"))       );
        TopPicksItem t3 = new TopPicksItem(R.drawable.n311,"Printed T-Shirt","Naruto","CLOTHINGS",
                19,"Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village."
                ,new ArrayList<>(Arrays.asList("n311","n312","n313")));
        TopPicksItem t4 = new TopPicksItem(R.drawable.ds311,"Cosplay","Demon Slayer","CLOTHINGS",
                149,"Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon."
                ,new ArrayList<>(Arrays.asList("ds311","ds312","ds313")));
        TopPicksItem t5 = new TopPicksItem(R.drawable.jj121,"Volume 27","JoJo","MANGA"
                ,32,"JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. "
                ,new ArrayList<>(Arrays.asList("jj121","jj122","jj123")));
        TopPicksItem t6 = new TopPicksItem(R.drawable.op111,"Volume","One piece","MANGA"
        ,19,"One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("op111","op112","op113")));
        TopPicksItem t7 = new TopPicksItem(R.drawable.op121,"Volume","One piece","MANGA",
                19,"One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("op121","op122","op123")));
        TopPicksItem t8 = new TopPicksItem(R.drawable.jj111,"Volume","JoJo","MANGA"
                ,35,"JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. "
                ,new ArrayList<>(Arrays.asList("jj111","jj112","jj113")));
        TopPicksItem t9 = new TopPicksItem(R.drawable.n111,"Volume","Naruto","MANGA",
                23,"Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village."
                ,new ArrayList<>(Arrays.asList("n111","n112","n113")));
        TopPicksItem t10 = new TopPicksItem(R.drawable.n121,"Volume","Naruto","MANGA",
                23,"Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village."
                ,new ArrayList<>(Arrays.asList("n121","n122","n123")));
        TopPicksItem t11 = new TopPicksItem(R.drawable.ds111,"Volume","Demon Slayer","MANGA",
                27,"Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon."
                ,new ArrayList<>(Arrays.asList("ds111","ds112","ds113")));
        TopPicksItem t12 = new TopPicksItem(R.drawable.ds121,"Volume","Demon Slayer","MANGA",
                27,"Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon."
                ,new ArrayList<>(Arrays.asList("ds121","ds122","ds123")));
        TopPicksItem t13 = new TopPicksItem(R.drawable.ds211,"Ichibansho Figure","Demon Slayer","FIGURES",
                119,"Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon."
                ,new ArrayList<>(Arrays.asList("ds211","dc212","dc213")));
        TopPicksItem t14 = new TopPicksItem(R.drawable.ds221,"Ichibansho Figure","Demon Slayer","FIGURES",
                139,"Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon."
                ,new ArrayList<>(Arrays.asList("ds221","ds222","ds223")));
        TopPicksItem t15 = new TopPicksItem(R.drawable.ds321,"Cosplay","Demon Slayer","CLOTHINGS",
                169,"Demon Slayer: Kimetsu no Yaiba is a Japanese manga series written and illustrated by Koyoharu Gotouge. It follows teenage Tanjiro Kamado, who strives to become a demon slayer after his family was slaughtered and his younger sister Nezuko turned into a demon."
                ,new ArrayList<>(Arrays.asList("ds321","ds322","ds323")));
        TopPicksItem t16 = new TopPicksItem(R.drawable.dc121,"Volume","Detective Conan","MANGA"
                ,29,"Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("dc121","dc122","dc123")));
        TopPicksItem t17 = new TopPicksItem(R.drawable.dc211,"Ichibansho Figure","Detective Conan","FIGURES"
                ,69,"Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("dc211","dc212","dc213")));
        TopPicksItem t18 = new TopPicksItem(R.drawable.dc221,"Ichibansho Figure","Detective Conan","FIGURES"
                ,59,"Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("dc221","dc222","dc223")));
        TopPicksItem t19 = new TopPicksItem(R.drawable.dc311,"T-Shirt","Detective Conan","CLOTHINGS"
                ,29,"Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("dc311","dc312","dc313")));
        TopPicksItem t20 = new TopPicksItem(R.drawable.dc321,"Beanie","Detective Conan","CLOTHINGS"
                ,19,"Case Closed, also known as Detective Conan, is a Japanese detective manga series written and illustrated by Gosho Aoyama. It has been serialized in Shogakukan's shōnen manga magazine Weekly Shōnen Sunday since January 1994, with its chapters collected in 101 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("dc321","dc322","dc323")));
        TopPicksItem t21 = new TopPicksItem(R.drawable.op221,"Ichibansho Figure","One Piece","FIGURES",
                59,"One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("op221","op222","op223")));
        TopPicksItem t22 = new TopPicksItem(R.drawable.op311,"T-shirt","One Piece","CLOTHINGS",
                23,"One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("op311","op312","op313")));
        TopPicksItem t23 = new TopPicksItem(R.drawable.op321,"Hat","One Piece","CLOTHINGS",
                16,"One Piece is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since July 1997, with its individual chapters compiled into 102 tankōbon volumes as of April 2022."
                ,new ArrayList<>(Arrays.asList("op321","op322","op323")));
        TopPicksItem t24 = new TopPicksItem(R.drawable.n321,"Hoodie","Naruto","CLOTHINGS",
                39,"Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village."
                ,new ArrayList<>(Arrays.asList("n321","n322","n323")));
        TopPicksItem t25 = new TopPicksItem(R.drawable.n211,"Ichibansho Figure","Naruto","FIGURES",
                79,"Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village."
                ,new ArrayList<>(Arrays.asList("n211","n212","n213")));
        TopPicksItem t26 = new TopPicksItem(R.drawable.n221,"Ichibansho Figure","Naruto","FIGURES",
                79,"Naruto is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village."
                ,new ArrayList<>(Arrays.asList("n221","n222","n223")));
        TopPicksItem t27 = new TopPicksItem(R.drawable.jj211,"Ichibansho Figure","JoJo","FIGURES"
                ,89,"JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. "
                ,new ArrayList<>(Arrays.asList("jj211","jj212","jj213")));
        TopPicksItem t28 = new TopPicksItem(R.drawable.jj221,"Ichibansho Figure","JoJo","FIGURES"
                ,89,"JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. "
                ,new ArrayList<>(Arrays.asList("jj221","jj222","jj223")));
        TopPicksItem t29 = new TopPicksItem(R.drawable.jj311,"T shirt","JoJo","CLOTHINGS"
                ,29,"JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. "
                ,new ArrayList<>(Arrays.asList("jj311","jj312","jj313")));
        TopPicksItem t30 = new TopPicksItem(R.drawable.jj321,"Hoodie","JoJo","CLOTHINGS"
                ,39,"JoJo's Bizarre Adventure is a Japanese manga series written and illustrated by Hirohiko Araki. It was originally serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump from 1987 to 2004, and was transferred to the monthly seinen manga magazine Ultra Jump in 2005. "
                ,new ArrayList<>(Arrays.asList("jj321","jj322","jj323")));


        totalItems.put(t1,0);
        totalItems.put(t2,0);
        totalItems.put(t3,0);
        totalItems.put(t4,0);
        totalItems.put(t5,0);
        totalItems.put(t6,0);
        totalItems.put(t7,0);
        totalItems.put(t8,0);
        totalItems.put(t9,0);
        totalItems.put(t10,0);
        totalItems.put(t11,0);
        totalItems.put(t12,0);
        totalItems.put(t13,0);
        totalItems.put(t14,0);
        totalItems.put(t15,0);
        totalItems.put(t16,0);
        totalItems.put(t17,0);
        totalItems.put(t18,0);
        totalItems.put(t19,0);
        totalItems.put(t20,0);
        totalItems.put(t21,0);
        totalItems.put(t22,0);
        totalItems.put(t23,0);
        totalItems.put(t24,0);
        totalItems.put(t25,0);
        totalItems.put(t26,0);
        totalItems.put(t27,0);
        totalItems.put(t28,0);
        totalItems.put(t29,0);
        totalItems.put(t30,0);
    }

    public static void increaseView(TopPicksItem item) {
        Integer count = totalItems.get(item);
        if (count == null) {
            count = 0;
        }
        count=count+1;
        totalItems.put(item, count);
    }


        public static List<TopPicksItem> getItemsOrderedByVisits() {
        List<Map.Entry<TopPicksItem, Integer>> entries = new ArrayList<>(totalItems.entrySet());
        Collections.sort(entries, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));
        Collections.reverse(entries);

        List<TopPicksItem> items = new ArrayList<>(entries.size());
        for (Map.Entry<TopPicksItem, Integer> entry : entries.subList(0, 5)) {
            items.add(entry.getKey());
        }
        return items;
    }

    public static List<TopPicksItem> getallItems() {
        List<TopPicksItem> allitems = new ArrayList<>();
        for (Map.Entry<TopPicksItem, Integer> entry : totalItems.entrySet()) {
            allitems.add(entry.getKey());
        }
        return allitems;




    public static ArrayList<CategoriesItem> generateCategories(){
        ArrayList<CategoriesItem> categoriesList = new ArrayList<CategoriesItem>();


        categoriesList.add(new CategoriesItem(R.drawable.manga,"MANGA"));
        categoriesList.add(new CategoriesItem(R.drawable.figure,"FIGURES"));
        categoriesList.add(new CategoriesItem(R.drawable.clothing,"CLOTHINGS"));


        return categoriesList;
    }


}

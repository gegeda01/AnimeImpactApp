package com.example.animeimpact;

import com.example.animeimpact.model.CategoriesItem;
import com.example.animeimpact.model.ListItem;
<<<<<<< Updated upstream
=======
import com.example.animeimpact.model.SearchItem;
>>>>>>> Stashed changes
import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;

public class DataProvider {
    public static ArrayList<TopPicksItem> generateTopPicks(){
        ArrayList<TopPicksItem> topPicksList = new ArrayList<TopPicksItem>();

        topPicksList.add(new TopPicksItem(R.drawable.dc121,"Special Edition","Detective Conan"));
        topPicksList.add(new TopPicksItem(R.drawable.op211,"Ichibansho Figure","One Piece"));
        topPicksList.add(new TopPicksItem(R.drawable.n311,"Printed T-Shirt","Naruto"));
        topPicksList.add(new TopPicksItem(R.drawable.ds311,"Cosplay","Demon Slayer"));
        topPicksList.add(new TopPicksItem(R.drawable.jj121,"Manga volume 27","JoJo"));

        return topPicksList;
    }

    public static ArrayList<CategoriesItem> generateCategories(){
        ArrayList<CategoriesItem> categoriesList = new ArrayList<CategoriesItem>();

        categoriesList.add(new CategoriesItem(R.drawable.manga,"Manga"));
        categoriesList.add(new CategoriesItem(R.drawable.figure,"Anime Figures"));
        categoriesList.add(new CategoriesItem(R.drawable.clothing,"Clothing Store"));

        return categoriesList;
    }

    public static ArrayList<ListItem> generateList1(){
        ArrayList<ListItem> listItemsList = new ArrayList<ListItem>();

        listItemsList.add(new ListItem("One Piece","Volume 9",19,R.drawable.op111));
        listItemsList.add(new ListItem("One Piece","Volume 97",19,R.drawable.op121));
        listItemsList.add(new ListItem("Detective Conan","Volume 61",29,R.drawable.dc111));
        listItemsList.add(new ListItem("Detective Conan","Special Edition",39,R.drawable.dc121));
        listItemsList.add(new ListItem("Demon Slayer","Volume 3",29,R.drawable.ds111));
        listItemsList.add(new ListItem("Demon Slayer","Volume 4",29,R.drawable.ds121));
        listItemsList.add(new ListItem("JoJo","Volume 2",39,R.drawable.jj111));
        listItemsList.add(new ListItem("JoJo","Volume 27",39,R.drawable.jj121));
        listItemsList.add(new ListItem("Naruto","Volume 6",29,R.drawable.n111));
        listItemsList.add(new ListItem("Naruto","Volume 3",29,R.drawable.n121));

        return listItemsList;
    }

    public static ArrayList<ListItem> generateList2(){
        ArrayList<ListItem> listItemsList = new ArrayList<ListItem>();

        listItemsList.add(new ListItem("One Piece","Figure 1",69,R.drawable.op211));
        listItemsList.add(new ListItem("One Piece","Figure 2",59,R.drawable.op221));
        listItemsList.add(new ListItem("Detective Conan","Figure 1",49,R.drawable.dc211));
        listItemsList.add(new ListItem("Detective Conan","Figure 2",49,R.drawable.dc221));
        listItemsList.add(new ListItem("Demon Slayer","Figure 1",59,R.drawable.ds211));
        listItemsList.add(new ListItem("Demon Slayer","Figure 2",49,R.drawable.ds221));
        listItemsList.add(new ListItem("JoJo","Figure 1",49,R.drawable.jj211));
        listItemsList.add(new ListItem("JoJo","Figure 2",49,R.drawable.jj221));
        listItemsList.add(new ListItem("Naruto","Figure 1",49,R.drawable.n211));
        listItemsList.add(new ListItem("Naruto","Figure 2",49,R.drawable.n221));

        return listItemsList;
    }

    public static ArrayList<ListItem> generateList3(){
        ArrayList<ListItem> listItemsList = new ArrayList<ListItem>();

        listItemsList.add(new ListItem("One Piece","T shirt",29,R.drawable.op311));
        listItemsList.add(new ListItem("One Piece","Hat",19,R.drawable.op321));
        listItemsList.add(new ListItem("Detective Conan","T shirt",25,R.drawable.dc311));
        listItemsList.add(new ListItem("Detective Conan","Beanie",19,R.drawable.dc321));
        listItemsList.add(new ListItem("Demon Slayer","Cosplay",49,R.drawable.ds311));
        listItemsList.add(new ListItem("Demon Slayer","Fox Cosplay",69,R.drawable.ds321));
        listItemsList.add(new ListItem("JoJo","T shirt",19,R.drawable.jj311));
        listItemsList.add(new ListItem("JoJo","Hoodie",29,R.drawable.jj321));
        listItemsList.add(new ListItem("Naruto","T shirt",19,R.drawable.n311));
        listItemsList.add(new ListItem("Naruto","Hoodie",29,R.drawable.n321));

        return listItemsList;
    }

<<<<<<< Updated upstream
=======
    public static ArrayList<SearchItem> generateSearchList(){
        ArrayList<SearchItem> searchItemsList = new ArrayList<SearchItem>();
        searchItemsList.add(new SearchItem("One Piece","Volume 9",19,R.drawable.op111));
        searchItemsList.add(new SearchItem("Detective Conan","Volume 61",29,R.drawable.dc111));
        searchItemsList.add(new SearchItem("Demon Slayer","Volume 3",29,R.drawable.ds111));
        searchItemsList.add(new SearchItem("Demon Slayer","Cosplay",49,R.drawable.ds311));
        searchItemsList.add(new SearchItem("Naruto","Volume 6",29,R.drawable.n111));
        searchItemsList.add(new SearchItem("One Piece","Volume 97",19,R.drawable.op121));
        searchItemsList.add(new SearchItem("One Piece","Figure 1",69,R.drawable.op211));
        searchItemsList.add(new SearchItem("One Piece","Figure 2",59,R.drawable.op221));
        searchItemsList.add(new SearchItem("One Piece","T shirt",29,R.drawable.op311));
        searchItemsList.add(new SearchItem("One Piece","Hat",19,R.drawable.op321));
        searchItemsList.add(new SearchItem("Detective Conan","Special Edition",39,R.drawable.dc121));
        searchItemsList.add(new SearchItem("Detective Conan","Figure 1",49,R.drawable.dc211));
        searchItemsList.add(new SearchItem("Detective Conan","Figure 2",49,R.drawable.dc221));
        searchItemsList.add(new SearchItem("Detective Conan","T shirt",25,R.drawable.dc311));
        searchItemsList.add(new SearchItem("Detective Conan","Beanie",19,R.drawable.dc321));
        searchItemsList.add(new SearchItem("Demon Slayer","Volume 4",29,R.drawable.ds121));
        searchItemsList.add(new SearchItem("Demon Slayer","Figure 1",59,R.drawable.ds211));
        searchItemsList.add(new SearchItem("Demon Slayer","Figure 2",49,R.drawable.ds221));
        searchItemsList.add(new SearchItem("Demon Slayer","Fox Cosplay",69,R.drawable.ds321));
        searchItemsList.add(new SearchItem("JoJo","Volume 2",39,R.drawable.jj111));
        searchItemsList.add(new SearchItem("JoJo","Volume 27",39,R.drawable.jj121));
        searchItemsList.add(new SearchItem("JoJo","Figure 1",49,R.drawable.jj211));
        searchItemsList.add(new SearchItem("JoJo","Figure 2",49,R.drawable.jj221));
        searchItemsList.add(new SearchItem("JoJo","T shirt",19,R.drawable.jj311));
        searchItemsList.add(new SearchItem("JoJo","Hoodie",29,R.drawable.jj321));
        searchItemsList.add(new SearchItem("Naruto","Volume 3",29,R.drawable.n121));
        searchItemsList.add(new SearchItem("Naruto","Figure 1",49,R.drawable.n211));
        searchItemsList.add(new SearchItem("Naruto","Figure 2",49,R.drawable.n221));
        searchItemsList.add(new SearchItem("Naruto","T shirt",19,R.drawable.n311));
        searchItemsList.add(new SearchItem("Naruto","Hoodie",29,R.drawable.n321));

        return searchItemsList;
    }

>>>>>>> Stashed changes

}

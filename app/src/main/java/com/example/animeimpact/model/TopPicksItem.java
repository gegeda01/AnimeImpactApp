package com.example.animeimpact.model;

import com.denzcoskun.imageslider.models.SlideModel;
import com.example.animeimpact.DataProvider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;


public class TopPicksItem implements Serializable {
    String type;//The category of that specific item
    String name;//The name of the anime
    String description;//The title of that specific item
    Integer image;//The image showing at first
    int price;//The price of that specific item
    String info;//The detailed information of that specific item
    ArrayList<String> imageset;//An array storing all the images of that specific item

    public TopPicksItem(Integer image, String description, String name, String type, int price, String info,ArrayList<String> imageset) {
        this.image=image;
        this.description = description;
        this.name = name;
        this.type=type;
        this.price=price;
        this.info = info;
        this.imageset = imageset;
    }

    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Integer getImage() {
        return image;
    }
    public void setImage(Integer image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public ArrayList<String> getImageset() {
        return imageset;
    }
    public void setImageset(ArrayList<String> imageset) {
        this.imageset = imageset;
    }

    //The following methods was inspired by https://www.youtube.com/watch?v=UtfFgJxvM4Q&t=244s
    //Sort the list from A-Z by comparing the first letter in their names
    public static Comparator<TopPicksItem> azSorter = new Comparator<TopPicksItem>() {
        @Override
        public int compare(TopPicksItem item1, TopPicksItem item2) {
            return item1.getname().compareTo(item2.getname());
        }
    };
    //Sort the list from Z-A by comparing the first letter in their names
    public static Comparator<TopPicksItem> zaSorter = new Comparator<TopPicksItem>() {
        @Override
        public int compare(TopPicksItem item1, TopPicksItem item2) {
            return item2.getname().compareTo(item1.getname());
        }
    };
    //Sort the list from low to high by comparing their prices
    public static Comparator<TopPicksItem> lowToHighSorter = new Comparator<TopPicksItem>() {
        @Override
        public int compare(TopPicksItem item1, TopPicksItem item2) {
            return item1.getPrice()-item2.getPrice();
        }
    };
    //Sort the list from high to low by comparing their prices
    public static Comparator<TopPicksItem> highToLowSorter = new Comparator<TopPicksItem>() {
        @Override
        public int compare(TopPicksItem item1, TopPicksItem item2) {
            return item2.getPrice()-item1.getPrice();
        }
    };
}
package com.example.animeimpact.model;

import java.util.Comparator;

public class ListItem {
    String title,volume;
    int price;
    Integer imageurl;

    public ListItem(String title, String volume, int price, Integer imageurl) {
        this.title = title;
        this.volume = volume;
        this.price = price;
        this.imageurl = imageurl;
    }
    public static Comparator<ListItem> PriceLowToHigh = new Comparator<ListItem>() {
        @Override
        public int compare(ListItem l1, ListItem l2) {
            return l1.getPrice()-l2.getPrice();
        }
    };{

    }
    public static Comparator<ListItem> PriceHighToLow = new Comparator<ListItem>() {
        @Override
        public int compare(ListItem l1, ListItem l2) {
            return l2.getPrice()-l1.getPrice();
        }
    };{

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}

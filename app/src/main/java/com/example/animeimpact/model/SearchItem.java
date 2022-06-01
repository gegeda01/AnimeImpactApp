package com.example.animeimpact.model;

import java.util.Comparator;

public class SearchItem {
    String title,volume;
    int price;
    Integer imageurl;

    public SearchItem(String title, String volume, int price, Integer imageurl) {
        this.title = title;
        this.volume = volume;
        this.price = price;
        this.imageurl = imageurl;
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

package com.example.animeimpact.model;

public class ListItem {
    String title,volume,price;
    Integer imageurl;

    public ListItem(String title, String volume, String price, Integer imageurl) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}

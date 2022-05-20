package com.example.animeimpact.model;

public class CategoriesItem {
    String text;
    Integer imageurl;

    public CategoriesItem(Integer imageurl,String text){
        this.imageurl=imageurl;
        this.text=text;
    }
    public String getText() {
        return text;
    }

    public void setId(String text) {
        this.text = text;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}

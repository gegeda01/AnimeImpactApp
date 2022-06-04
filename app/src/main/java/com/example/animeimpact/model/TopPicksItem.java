package com.example.animeimpact.model;

import com.denzcoskun.imageslider.models.SlideModel;
import com.example.animeimpact.DataProvider;

import java.io.Serializable;
import java.util.ArrayList;


public class TopPicksItem implements Serializable {
    String type;
    String name;
    String description;
    Integer image;
    int price;
    String info;



    ArrayList<String> imageset;



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
}
package com.example.animeimpact.model;

public class DetailsItem {
    String itemName, price, detail, description;
    Integer imageurl;

    public DetailsItem (String itemName, String price, String detail, String description, Integer imageurl) {
        this.itemName = itemName;
        this.price = price;
        this.detail = detail;
        this.description = description;
        this.imageurl = imageurl;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}

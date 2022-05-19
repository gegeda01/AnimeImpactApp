package com.example.animeimpact.model;

public class TopPicksItem {
    String text1;
    String text2;
    Integer imageurl;

    public TopPicksItem( Integer imageurl,String text1,String text2) {
        this.imageurl = imageurl;
        this.text1 = text1;
        this.text2 = text2;
    }

    public String getText1() {
        return text1;
    }

    public void setId(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text1 = text2;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}

package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Book {
    @SerializedName("title")
    private String title;
    @SerializedName("img_url")
    private String img_url;
    @SerializedName("total")
    private String total;
    @SerializedName("kb")
    private List<String> kb;
    @SerializedName("yes")
    private List<String> yes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<String> getKb() {
        return kb;
    }

    public void setKb(List<String> kb) {
        this.kb = kb;
    }

    public List<String> getYes() {
        return yes;
    }

    public void setYes(List<String> yes) {
        this.yes = yes;
    }
}

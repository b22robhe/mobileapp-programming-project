package com.example.project;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

@SuppressWarnings("WeakerAccess")
public class Planet {

    private String name;
    private String id;
    @SerializedName("company")
    private String moons;
    private String category;
    @SerializedName("size")
    private int surfaceArea;
    @SerializedName("auxdata")
    private LinkedTreeMap imageURL;




    public Planet() {
        name="No Name";
    }

    public Planet(String id, String name, String company, String category,int size, String auxdata) {

    }



    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getMoons() {
        return String.valueOf(this.moons);
    }
    public String getCategory() {
        return this.category;
    }
    public String getSurfaceArea() {
        return String.valueOf(this.surfaceArea);
    }
    public String getImageURL() {
        return this.imageURL.get("wiki").toString();
    }
    @Override
    public String toString(){
        return imageURL.get("wiki").toString();
    }
}
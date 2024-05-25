package com.example.project;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class Planet {

    private final String name;
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



    public String getId() {
        return this.id;
    }
    public String getName() {
        return "Name: " + this.name;
    }
    public String getMoons() {
        return "Moons: " + this.moons;
    }
    public String getCategory() {
        return "Category: " + this.category;
    }
    public String getSurfaceArea() {
        return "Surface Area (relative to Earth): " + this.surfaceArea;
    }
    public String getImageURL() {

        return Objects.requireNonNull(this.imageURL.get("wiki")).toString();
    }
    @Override
    public String toString(){
        return Objects.requireNonNull(imageURL.get("wiki")).toString();
    }
}
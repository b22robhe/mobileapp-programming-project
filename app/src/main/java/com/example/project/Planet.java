package com.example.project;

@SuppressWarnings("WeakerAccess")
public class Planet {

    private String name;
    private String id;
    private int moons;
    private String category;
    private float surfaceArea;
    private String imageURL;




    public Planet() {
        name="No Name";
    }

    public Planet(String id, String name, String company, String category,int size, String auxdata) {
        this.id = id;
        this.name = name;
        this.moons = Integer.valueOf(company);
        this.category = category;
        this.surfaceArea = size/1000;
        this.imageURL = auxdata;
    }



    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getMoons() {
        return this.moons;
    }
    public String getCategory() {
        return this.category;
    }
    public float getSurfaceArea() {
        return this.surfaceArea;
    }
    public String getImageURL() {
        return this.imageURL;
    }
    @Override
    public String toString(){
        return category;
    }
}
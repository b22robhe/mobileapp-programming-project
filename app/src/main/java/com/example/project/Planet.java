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

    public Planet(String id, String name, int moons, String category,float surfaceArea, String imageURL) {
        this.id = id;
        this.name = name;
        this.moons = moons;
        this.category = category;
        this.surfaceArea = surfaceArea;
        this.imageURL = imageURL;
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
        return name;
    }
}
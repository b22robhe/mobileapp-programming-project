package com.example.project;

@SuppressWarnings("WeakerAccess")
public class Planet {

    private String name;
    private String location;
    private int height;


    public Planet() {
        name="No Name";
        location="No Location";
        height=-1;
    }

    public Planet(String name, String location, int height) {
        this.name = name;
        this.location = location;
        this.height= height;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public String toString(){
        return name;
    }
}
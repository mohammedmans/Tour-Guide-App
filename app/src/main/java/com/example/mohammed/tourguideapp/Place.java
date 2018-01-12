package com.example.mohammed.tourguideapp;

/**
 * Created by Mohammed on 1/10/2018.
 */

public class Place {
    private String desc;
    private int mImageResourceID;
    private String location;
    private String Name;

    public String getName() {
        return Name;
    }

    public String getLocation() {
        return location;
    }

    public Place(String Name, int mImageResourceID, String desc, String location) {
        this.desc = desc;
        this.mImageResourceID = mImageResourceID;
        this.Name = Name;
        this.location = location;


    }

    public String getDesc() {
        return desc;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }
}

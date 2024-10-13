package com.example.carsncars.Models;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String name, type, year, price, imageUrl;

    public Vehicle(String name, String type, String year, String price, String imageUrl) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public String getYear() { return year; }
    public String getPrice() { return price; }
    public String getImageUrl() { return imageUrl; }

    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setYear(String year) { this.year = year; }
    public void setPrice(String price) { this.price = price; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}

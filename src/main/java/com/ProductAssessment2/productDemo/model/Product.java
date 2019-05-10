package com.ProductAssessment2.productDemo.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    //@GeneratedValue
    private int Id;
    private String brand;
    private String color;
    private double price;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public Product(){ }

    public Product(int id, String brand, String color, double price) {
        this.Id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


}

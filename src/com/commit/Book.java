package com.commit;

public class Book {

    private String type = null;
    private double price = 0;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    Book(String type, double price){
        this.type = type;
        this.price = price;
    }
}

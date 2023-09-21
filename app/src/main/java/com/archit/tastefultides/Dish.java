package com.archit.tastefultides;

import androidx.annotation.NonNull;

public class Dish {
    String name;
    String description;
    int price;

    Dish(String name,String description,int price){
        this.name=name;
        this.description=description;
        this.price=price;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}

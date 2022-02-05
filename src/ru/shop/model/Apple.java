package ru.shop.model;

import java.util.Random;

public class Apple extends Fruit {

    public Apple(String name){
       super(name);
    }


    public Apple(){

    }


    @Override
    public void eat() {

    }

    @Override
    public void makeJuice() {

    }

    @Override
    public int hashCode() {
        Random r = new Random();
        return r.nextInt();
    }
}

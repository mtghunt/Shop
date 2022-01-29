package ru.shop.model;

public class Apple implements Fruit {


    private String kg;

    @Override
    public void eat() {

    }

    @Override
    public void makeJuice() {

    }

    @Override
    public String toString() {
        return "Apple{" +
                "kg='" + kg + '\'' +
                '}';
    }
}

package ru.shop.model;

import java.util.Objects;

public abstract class Product {

    private String name;
    private double ves;

    abstract void eat();
    abstract void makeJuice();

    public Product(String name){
        this.name = name;
    }

    public Product(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return name != null ? name.equals(product.name) : product.name == null;
    }


}

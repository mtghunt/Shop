package ru.shop.service;

import ru.shop.model.Product;

import java.util.ArrayList;
import java.util.Collection;

public class BasketOnList implements Basket {

   private Collection<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public Object[] getProducts() {
        return products.toArray();
    }
}

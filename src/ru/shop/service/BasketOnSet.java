package ru.shop.service;

import ru.shop.model.Apple;
import ru.shop.model.Product;


import java.util.Collection;
import java.util.HashSet;

public class BasketOnSet implements Basket {

    private Collection<Product> products = new HashSet<>();

    @Override
    public void addProduct(Product p) {
        products.add(p);
        products.add(new Apple());
    }

    @Override
    public Object[] getProducts() {
        return products.toArray();
    }
}

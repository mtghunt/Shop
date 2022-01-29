package ru.shop.service;

import ru.shop.model.Product;

public interface Basket {
    void addProduct(Product p);
    Object[] getProducts();
}

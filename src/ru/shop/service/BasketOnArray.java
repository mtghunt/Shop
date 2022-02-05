package ru.shop.service;

import ru.shop.model.Product;

public class BasketOnArray implements Basket {

   private int basketIndex;

   private int regenArrayIndex;

   private Product[] products = new Product[10];

    public void addProduct(Product p) {
        if (regenArrayIndex >= 10) {
            Product[] products2 = new Product[products.length + 10];
            System.arraycopy(products, 0, products2, 0, products.length);
            products = products2;
            regenArrayIndex = 0;
        }

        products[basketIndex++] = p;
        regenArrayIndex++;
    }

    public Product[] getProducts() {
        return products;
    }
}

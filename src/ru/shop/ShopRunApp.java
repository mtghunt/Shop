package ru.shop;

import ru.shop.model.Apple;
import ru.shop.service.*;
import ru.shop.model.KIvi;
import ru.shop.model.Product;

import java.util.Random;

public class ShopRunApp {

    public static void main(String[] args) {

        ShopService s = new ShopService();

        Basket myBasket = new BasketOnSet();

        for(int i = 0; i < 10000; i++) {
            myBasket.addProduct(selectAnyProduct());
        }
        // s.buy();


        for(int i = 0; i < myBasket.getProducts().length; i++)
            System.out.println("Index: " + i + " Product: "+ myBasket.getProducts()[i]);

    }



    private static Product selectAnyProduct() {
        Random r = new Random();
        int i = r.nextInt(100);
        if(i % 2 == 0) {
            return new Apple();
        }
        return new KIvi();
    }
}

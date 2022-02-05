package ru.shop;

import ru.shop.model.Apple;
import ru.shop.model.Fruit;

import java.util.*;

public class FindFruitApp {

    //0        1            623
    //0       null     Золое яблоко

    public static void main(String[] args) {

       Collection<Fruit> collection = populateCollection();


      //printCollection(collection);
        System.out.println(collection.contains(new Apple("Яблоко 999")));
    }

    private static void printCollection(Collection<Fruit> collection) {
        for (Fruit f : collection){
            System.out.println(f.getName() + " " + f.hashCode());
        }
    }

    private static Collection<Fruit> populateCollection() {

        HashSet<Fruit> set = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            set.add(new Apple("Яблоко " + i));
        }
        return set;
    }

}

package by.kursy.vikvik.javalessons.lesson23.ooptask.controller;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;
import by.kursy.vikvik.javalessons.lesson23.ooptask.model.container.SingleList;

public class Main {
    public static void main(String[] args) {
        SingleList list = new SingleList();
        list.add(new Flower());

        System.out.println(list.get(0));

//        Flower[] flowers = new Flower[10];
//
//        for (int i = 0; i < 5; i++) {
//            flowers[i] = new Rose("Pink Panther", "Pink", 3.5, 78, 200, 1.5);
//        }
//
//        for (int i = 5; i < flowers.length; i++) {
//            flowers[i] = new Chamomile("Pink Panther", "Pink", 3.5, 78, 70, 11);
//        }
//
//        Bouquet4 bouquet = new Bouquet4(flowers);
//        double totalWeight = ShopAssistance.calculateTotalWeight(bouquet);
//        double totalPrice = ShopAssistance.calculateTotalPrice(bouquet);
//
//        System.out.println(bouquet);
//        System.out.println("Total price: " + totalPrice);
//        System.out.println("Total weight: " + totalWeight);
    }
}

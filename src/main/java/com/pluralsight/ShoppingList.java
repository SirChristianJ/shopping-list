package com.pluralsight;

public class ShoppingList {
    public static void main(String[] args){
        System.out.println("Shopping List");
        System.out.println("-------------------");
        String[] shopList = {"Apples","Bananas","Cherries","DinoNuggies","Eggs","Fanta","Grapes","Honeybuns","Icing","Jerky"};
        for(int i = 0; i < shopList.length;i++){
            System.out.println(shopList[i]);
        }
    }
}

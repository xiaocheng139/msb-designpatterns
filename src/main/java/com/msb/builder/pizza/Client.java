package com.msb.builder.pizza;

public class Client {
    public static void main(String[] args) {
        MyPizza myPizza = new MyPizza.Builder(MyPizza.Size.SMALL).addTopping(Pizza.Topping.MUSHROOM).build();
    }
}

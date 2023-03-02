package com.msb.strategy;

public class Cat implements Comparable<Cat>{
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }


    @Override
    public int compareTo(Cat o) {
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}

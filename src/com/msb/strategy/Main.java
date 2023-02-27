package com.msb.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] a  = {9, 2, 3, 5, 7, 1, 4};
        Cat[] cats = {new Cat(3, 3), new Cat(1, 1), new Cat(5, 5)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(cats, (o1, o2) -> o1.weight - o2.height);
        for (Cat cat: cats) System.out.println(cat);
    }
}

package com.msb.builder.nutrition;

public class Client {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder().setCalories(100).setServingsSize(2).build();
    }
}

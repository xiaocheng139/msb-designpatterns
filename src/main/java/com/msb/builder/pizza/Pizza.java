package com.msb.builder.pizza;

import com.msb.builder.nutrition.NutritionFacts;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION};
    public Set<Topping> toppings;

    abstract static class Builder<T> {
        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        abstract Pizza build();

        abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}

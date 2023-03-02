package com.msb.builder.pizza;

public class MyPizza extends Pizza{
    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }
     private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private Size size;

        public Builder(Size size) {
            this.size = size;
        }

        @Override
        MyPizza build() {
            return new MyPizza(this);
        }

        @Override
        Builder self() {
            return this;
        }
    }

    MyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}

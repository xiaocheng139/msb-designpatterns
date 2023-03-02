package com.msb.builder.nutrition;

public class NutritionFacts {
    private int serveringsSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int cardohydrate;

    private NutritionFacts(Builder builder) {
        this.serveringsSize = builder.serveringsSize;
        this.cardohydrate = builder.cardohydrate;
        this.sodium = builder.sodium;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
    }

    public static class Builder {
        private int serveringsSize;
        private int servings;
        private int calories;
        private int fat;
        private int sodium;
        private int cardohydrate;

        public Builder setServingsSize(int serveringsSize) {
            this.serveringsSize = serveringsSize;
            return this;
        }

        public Builder setServings(int servings) {
            this.servings = servings;
            return this;
        }

        public Builder setCalories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder setFat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder setSodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder setCardohydrate(int cardohydrate) {
            this.cardohydrate = cardohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}

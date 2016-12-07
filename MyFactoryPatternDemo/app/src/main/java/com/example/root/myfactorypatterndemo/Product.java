package com.example.root.myfactorypatterndemo;

import android.util.Log;

public class Product {
    private String sauce;
    private String pepper;
    private String mayonaise;

    public Product(String sauce, String pepper, String mayonaise) {
        this.sauce = sauce;
        this.pepper = pepper;
        this.mayonaise = mayonaise;
    }

    public static class ProductBuilder {
        private String innerSauce = "No Sauce Selected";
        private String innerPepper = "No Pepper Selected";
        private String innerMayonaise = "No Mayonaise Selected";

        public ProductBuilder() {
        }

        public String getInnerSauce() {
            return this.innerSauce;
        }

        public ProductBuilder setInnerSauce(String innerSauce) {
            this.innerSauce = innerSauce;
            Log.i("ChipFactory", innerSauce);
            return this;
        }

        public ProductBuilder setInnerPepper(String innerPepper) {
            this.innerPepper = innerPepper;
            Log.i("ChipFactory", innerPepper);
            return this;
        }

        public ProductBuilder setInnerMayonaise(String innerMayonaise) {
            this.innerMayonaise = innerMayonaise;
            return this;
        }

        public String getInnerPepper() {
            return this.innerPepper;
        }

        public String getInnerMayonaise() {
            return this.innerMayonaise;
        }

        public Product createProduct() {
            return new Product(innerSauce, innerPepper, innerMayonaise);
        }
    }
}

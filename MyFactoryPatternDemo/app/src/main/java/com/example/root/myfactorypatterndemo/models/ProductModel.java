package com.example.root.myfactorypatterndemo.models;

import android.util.Log;

/**
 * Created by root on 6/12/16.
 */

public class ProductModel {
    String sauce;
    String pepper;
    String mayonaise;


    public ProductModel(String sauce, String pepper, String mayonaise) {
        this.sauce = sauce;
        this.pepper = pepper;
        this.mayonaise = mayonaise;
    }

    public static class ProductBuilder {
        String innerSauce = "No Sauce Selected";
        String innerPepper = "No Pepper Selected";
        String innerMayonaise = "No Mayonaise Selected";

        public ProductBuilder() {

        }

        public String getInnerSauce() {
            return this.innerSauce;
        }

        public ProductBuilder setInnerSauce(String innerSauce) {

            this.innerSauce = innerSauce;
            Log.i("ChipFactory",innerSauce);

            return this;
        }

        public ProductBuilder setInnerPepper(String innerPepper) {
            this.innerPepper = innerPepper;
            Log.i("ChipFactory",innerPepper);
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
        public ProductModel createProduct()
        {
            return  new ProductModel(innerSauce,innerPepper,innerMayonaise);
        }

    }


}

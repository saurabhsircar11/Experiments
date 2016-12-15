package com.example.root.myfacadeexample.models;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by root on 15/12/16.
 */

public class BurgerMaker {
    private McAlooTikki mcAlooTikki;
    private McChicken mcChicken;

    public BurgerMaker(Context context) {
        mcAlooTikki = new McAlooTikki(context);
        mcChicken = new McChicken(context);
    }

    public String mcAlooTikkiDetails() {
        return mcAlooTikki.getBurgerDetails();
    }

    public String mcChickenDetails() {
        return mcChicken.getBurgerDetails();
    }

    public Drawable mcAlooTikkiDrawable() {
        return mcAlooTikki.getBurgerImage();
    }

    public Drawable mcChickenDrawable() {
        return mcChicken.getBurgerImage();
    }
}

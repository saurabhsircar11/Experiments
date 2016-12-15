package com.example.root.myfacadeexample.models;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import com.example.root.myfacadeexample.R;
import com.example.root.myfacadeexample.interfaces.Burger;

/**
 * Created by root on 15/12/16.
 */

public class McAlooTikki implements Burger {
    Drawable mcAlooTikki;

    public McAlooTikki(Context context) {
        mcAlooTikki = ContextCompat.getDrawable(context, R.drawable.mc_aloo_tikki);
    }


    @Override
    public String getBurgerDetails() {
        return "You got McAloo Tikki as per your selected choice";

    }

    @Override
    public Drawable getBurgerImage() {
        return mcAlooTikki;
    }
}

package com.example.root.myfacadeexample.models;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import com.example.root.myfacadeexample.R;
import com.example.root.myfacadeexample.interfaces.Burger;

import butterknife.BindDrawable;

/**
 * Created by root on 15/12/16.
 */

public class McChicken implements Burger {
     Drawable mcChicken;
    public McChicken(Context context)
    {
        mcChicken= ContextCompat.getDrawable(context,R.drawable.mc_chicken);
    }
    @Override
    public String getBurgerDetails() {
        return "You got McChicken as per your selected choice";
    }

    @Override
    public Drawable getBurgerImage() {
        return mcChicken;
    }
}

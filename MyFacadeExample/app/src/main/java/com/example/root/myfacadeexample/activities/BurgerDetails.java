package com.example.root.myfacadeexample.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.root.myfacadeexample.R;
import com.example.root.myfacadeexample.models.BurgerMaker;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BurgerDetails extends AppCompatActivity {
    @BindView(R.id.textViewBurgerDetails)
    TextView textViewBurgerDetails;
    @BindView(R.id.imageViewBurgerSelected)
    ImageView imageViewBurgerSelected;
    boolean choice;
    BurgerMaker burgerMaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_details);
        ButterKnife.bind(this);
        burgerMaker = new BurgerMaker(BurgerDetails.this);
        Intent intent = getIntent();
        choice = intent.getBooleanExtra("choice", false);
        if (choice) {
            setBurger(burgerMaker.mcChickenDetails(), burgerMaker.mcChickenDrawable());
        } else {
            setBurger(burgerMaker.mcAlooTikkiDetails(), burgerMaker.mcAlooTikkiDrawable());
        }
    }

    private void setBurger(String text, Drawable drawable) {
        textViewBurgerDetails.setText(text);
        imageViewBurgerSelected.setImageDrawable(drawable);
    }
}

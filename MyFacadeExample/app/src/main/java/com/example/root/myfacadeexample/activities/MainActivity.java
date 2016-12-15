package com.example.root.myfacadeexample.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.root.myfacadeexample.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    boolean choice = false;

    @OnClick({R.id.buttonMcAlooTikki, R.id.buttonMcChicken})
    public void selectBurger(View view) {
        switch (view.getId()) {
            case R.id.buttonMcChicken:
                choice = true;
                break;
            default:choice =false;

        }
        navigateToOrderDetails();
    }

    private void navigateToOrderDetails() {
        Intent intent = new Intent(MainActivity.this, BurgerDetails.class);
        intent.putExtra("choice", choice);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}

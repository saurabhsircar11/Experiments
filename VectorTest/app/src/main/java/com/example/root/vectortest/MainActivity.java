package com.example.root.vectortest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import static com.example.root.vectortest.R.id.imageView;

public class MainActivity extends AppCompatActivity {
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(imageView);
        Picasso.with(this).load("http://thecodementors.com/sitemedia/42/receipts/images/42.jpeg")
                .into(mImageView);


    }
}

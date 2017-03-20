package com.example.root.myanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout mButtonAnimation;
    ImageView mImageViewMicrophone;
    AnimationDrawable mRocketAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonAnimation = (LinearLayout) findViewById(R.id.linearLayoutBackground);
        mImageViewMicrophone = (ImageView) findViewById(R.id.imageViewMicrophone);
        mImageViewMicrophone.setBackgroundResource(R.drawable.drawable_animated);
        mRocketAnimation = (AnimationDrawable) mImageViewMicrophone.getBackground();
        final ScaleAnimation growAnim = new ScaleAnimation(1.0f, 10.0f, 1.0f, 1.0f, Animation
                .RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        final ScaleAnimation shrinkAnim = new ScaleAnimation(10.0f, 1.0f, 1.0f, 1.0f, Animation
                .RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        growAnim.setDuration(2000);
        shrinkAnim.setDuration(2000);
        growAnim.setInterpolator(MainActivity.this, R.anim.custom_interpolator);
        mButtonAnimation.setAnimation(growAnim);
        mRocketAnimation.start();
        growAnim.start();
        growAnim.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mButtonAnimation.setAnimation(shrinkAnim);
                shrinkAnim.start();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {


            }
        });
        shrinkAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                mButtonAnimation.setAnimation(growAnim);
                growAnim.start();


            }
        });


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
       mRocketAnimation.start();
        return super.onTouchEvent(event);
    }
}

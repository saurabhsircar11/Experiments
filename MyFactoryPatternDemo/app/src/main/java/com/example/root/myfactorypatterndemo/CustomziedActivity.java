package com.example.root.myfactorypatterndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CustomziedActivity extends AppCompatActivity {

    @BindView(R.id.pepperRadioGroup)
    RadioGroup pepperRadioGroup;
    @BindView(R.id.sauceRadioGroup)
    RadioGroup sauceRadioGroup;
    @OnClick(R.id.btnOrderBuild)
    public void submit() {
        String pepperChoice=null;
        String sauceChoice=null;
        int selectedId = pepperRadioGroup.getCheckedRadioButtonId();
        switch (selectedId) {

            case R.id.rbRedPepper:
                pepperChoice="Red Pepper";
                break;
            case R.id.rbBlackPepper:
                pepperChoice="Black Pepper";
                break;
            default:
        }
        selectedId = sauceRadioGroup.getCheckedRadioButtonId();
        switch (selectedId)
        {
            case R.id.rbWhiteSauce:
                sauceChoice="White Sauce";
                break;
            case R.id.rbRedSauce:
                sauceChoice="Red Sauce";
                break;
            default:

        }
        Product product = new Product.ProductBuilder().setInnerPepper(pepperChoice).setInnerSauce(sauceChoice).createProduct();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customzied);

        ButterKnife.bind(this);
    }

}

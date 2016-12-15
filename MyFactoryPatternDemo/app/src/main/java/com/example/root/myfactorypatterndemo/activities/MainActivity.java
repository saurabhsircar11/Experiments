package com.example.root.myfactorypatterndemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.root.myfactorypatterndemo.R;
import com.example.root.myfactorypatterndemo.SingleChipFactoryObject;
import com.example.root.myfactorypatterndemo.interfaces.Chips;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    final private String TAG = "ChipFactory";
    @BindView(R.id.btnIndianMasala)
    Button btnIndianMasala;
    @BindView(R.id.btnLaysOnionCheese)
    Button btnLaysOnionCheese;
    @BindView(R.id.btnLaysSaltedSpecial)
    Button btnLaysSaltedSpecial;
    @BindView(R.id.btnNext)
    Button btnNext;
    @BindView(R.id.tv_description)
    TextView description;
    //ChipFactory chipFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //chipFactory = new ChipFactory();
        //SingleChipFactoryObject.getInstance();
    }

    @OnClick({R.id.btnLaysSaltedSpecial, R.id.btnLaysOnionCheese, R.id.btnIndianMasala})
    public void pickFlavour(View view) {
        switch (view.getId()) {
            case R.id.btnIndianMasala:
                setOptions(SingleChipFactoryObject.MASALA);
                break;
            case R.id.btnLaysOnionCheese:
                setOptions(SingleChipFactoryObject.ONION);
                break;
            default:
                setOptions(SingleChipFactoryObject.SALTED);
                break;
        }
        disableOptions();
    }


    private void setOptions(String option) {
        Chips laysIndianMasala = SingleChipFactoryObject.getInstance().getChipType(option);
        String choice = "No Chip Selected";
        if (laysIndianMasala != null) {
            choice = laysIndianMasala.makeChips();
        }
        description.setText(choice);
    }

    private void disableOptions() {
        btnIndianMasala.setEnabled(false);
        btnLaysOnionCheese.setEnabled(false);
        btnLaysSaltedSpecial.setEnabled(false);
    }

    @OnClick(R.id.btnNext)
    public void naviagteToCustomizeActivity() {
        //Toast.makeText(MainActivity.this,"Still Coming",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, CustomziedActivity.class);
        startActivity(intent);

    }


}

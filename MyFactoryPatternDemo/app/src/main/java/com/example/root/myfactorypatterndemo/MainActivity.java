package com.example.root.myfactorypatterndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    final private String TAG = "ChipFactory";
    @BindView(R.id.btnLaysIndianMasala)
    Button btnLaysIndianMasala;
    @BindView(R.id.btnLaysOnionCheese)
    Button btnLaysOnionCheese;
    @BindView(R.id.btnLaysSaltedSpecial)
    Button btnLaysSaltedSpecial;
    @BindView(R.id.btnNext)
    Button btnNext;
    @BindView(R.id.tvDescription)
    TextView tvDescription;
    //ChipFactory chipFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //chipFactory = new ChipFactory();
        //SingleChipFactoryObject.getInstance();

    }

    @OnClick({R.id.btnLaysSaltedSpecial, R.id.btnLaysOnionCheese, R.id.btnLaysIndianMasala})
    public void pickFlavour(View view) {
        switch (view.getId()) {

            case R.id.btnLaysIndianMasala:
                btnLaysIndianMasala.setEnabled(false);
                btnLaysOnionCheese.setEnabled(false);
                btnLaysSaltedSpecial.setEnabled(false);
                Chips laysIndianMasala = SingleChipFactoryObject.getInstance().getChipType("INDIANMASALA");
                if (laysIndianMasala != null) {
                    String choice = laysIndianMasala.makeChips();
                    tvDescription.setText(choice);
                } else {
                    Log.e(TAG, "No Chip Selected");
                    tvDescription.setText("No Chip Selected");
                }

                break;
            case R.id.btnLaysOnionCheese:
                btnLaysIndianMasala.setEnabled(false);
                btnLaysOnionCheese.setEnabled(false);
                btnLaysSaltedSpecial.setEnabled(false);
                Chips laysOnionCheese = SingleChipFactoryObject.getInstance().getChipType("ONIONANDCHEESE");
                if (laysOnionCheese != null) {
                    String choice = laysOnionCheese.makeChips();
                    tvDescription.setText(choice);
                } else {
                    Log.e(TAG, "No Chip Selected");
                    tvDescription.setText("No Chip Selected");
                }
                break;
            case R.id.btnLaysSaltedSpecial:
                btnLaysIndianMasala.setEnabled(false);
                btnLaysOnionCheese.setEnabled(false);
                btnLaysSaltedSpecial.setEnabled(false);
                Chips laysSaltedSpecial = SingleChipFactoryObject.getInstance().getChipType("SALTEDSPECIAL");
                if (laysSaltedSpecial != null) {
                    String choice = laysSaltedSpecial.makeChips();
                    tvDescription.setText(choice);
                } else {
                    Log.e(TAG, "No Chip Selected");
                    tvDescription.setText("No Chip Selected");
                }
                break;
            default:
        }


    }
    @OnClick(R.id.btnNext)
    public void naviagteToCustomizeActivity()
    {
        //Toast.makeText(MainActivity.this,"Still Coming",Toast.LENGTH_LONG).show();
        Intent intent= new Intent(MainActivity.this,CustomziedActivity.class);
        startActivity(intent);

    }

}

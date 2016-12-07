package com.example.root.myfactorypatterndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnLaysSaltedSpecial, R.id.btnLaysOnionCheese, R.id.btnLaysIndianMasala})
    public void pickFlavour(View view) {
        switch (view.getId()) {
            case R.id.btnLaysIndianMasala:
                displayChipType(ChipFactory.MASALA);
                break;
            case R.id.btnLaysOnionCheese:
                displayChipType(ChipFactory.ONION);
                break;
            case R.id.btnLaysSaltedSpecial:
                displayChipType(ChipFactory.SALTED);
                break;
            default:
        }
        disableButtons();
    }

    private void displayChipType(String chipType) {
        Chips laysSaltedSpecial = SingleChipFactory.getInstance().getChipType(chipType);
        if (laysSaltedSpecial != null) {
            String choice = laysSaltedSpecial.makeChips();
            tvDescription.setText(choice);
        } else {
            Log.e(TAG, "No Chip Selected");
            tvDescription.setText("No Chip Selected");
        }
    }

    /**
     *
     */
    private void disableButtons() {
        btnLaysIndianMasala.setEnabled(false);
        btnLaysOnionCheese.setEnabled(false);
        btnLaysSaltedSpecial.setEnabled(false);
    }

    @OnClick(R.id.btnNext)
    public void navigateToCustomizeActivity() {
        Intent intent = new Intent(MainActivity.this, CustomziedActivity.class);
        startActivity(intent);
    }
}

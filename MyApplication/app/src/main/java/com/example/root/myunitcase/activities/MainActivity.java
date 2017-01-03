package com.example.root.myunitcase.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.root.myunitcase.R;
import com.example.root.myunitcase.utility.DateTimeConverter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tvTimestamp)
    TextView tvTimestamp;
    @BindView(R.id.tvFormattedDate)
    TextView tvFormattedDate;
    DateTimeConverter dateTimeConverter;
    String millisText;
    long millis;

    @OnClick(R.id.btnConvert)
    public void convert() {
        String dateFormat = dateTimeConverter.convertTimeStamp(millis);
        tvFormattedDate.setText(dateFormat);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        dateTimeConverter = new DateTimeConverter();
        millis = System.currentTimeMillis();
        millisText = String.valueOf(millis);
        tvTimestamp.setText(millisText);
    }
}

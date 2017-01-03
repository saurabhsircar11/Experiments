package com.example.root.myunitcase.utility;

import java.text.SimpleDateFormat;

/**
 * Created by root on 3/1/17.
 */

public class DateTimeConverter {
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy");


    public String convertTimeStamp(long timeStamp) {
        if (timeStamp == 0) return null;
        try {
            return simpleDateFormat.format(timeStamp);

        } catch (Exception e) {
            return null;
        }

    }

}

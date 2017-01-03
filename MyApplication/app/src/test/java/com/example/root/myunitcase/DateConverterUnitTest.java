package com.example.root.myunitcase;

import com.example.root.myunitcase.utility.DateTimeConverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by root on 3/1/17.
 */

public class DateConverterUnitTest {
    DateTimeConverter dateTimeConverter = new DateTimeConverter();

    @Test
    public void dateConverter_isCorrect() {

        assertEquals("03 Jan 2017", dateTimeConverter.convertTimeStamp(1483444626003L));
    }

    @Test
    public void dateConverter_isBefore1970() {
        assertEquals("01 Jan 1970", dateTimeConverter.convertTimeStamp(-123));
        assertEquals("01 Jan 1970",dateTimeConverter.convertTimeStamp(123123));

    }

    @Test
    public void dateConverter_inputIsNull() {
        assertEquals(null, dateTimeConverter.convertTimeStamp(0));

    }


}

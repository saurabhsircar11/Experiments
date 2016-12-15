package com.example.root.myfactorypatterndemo.models;

import com.example.root.myfactorypatterndemo.interfaces.Chips;

/**
 * Created by root on 6/12/16.
 */

public class LaysIndianMasalaModel implements Chips {

    @Override
    public String makeChips() {
        return "You selected LaysIndianMasalaModel please click on next to build your customized order";

    }
}

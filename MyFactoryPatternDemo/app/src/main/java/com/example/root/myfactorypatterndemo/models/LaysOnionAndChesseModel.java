package com.example.root.myfactorypatterndemo.models;

import com.example.root.myfactorypatterndemo.interfaces.Chips;

/**
 * Created by root on 6/12/16.
 */

public class LaysOnionAndChesseModel implements Chips {
    @Override
    public String makeChips() {
        return "You selected LaysOnionAndChesseModel please click on next to build your customized order";
    }
}

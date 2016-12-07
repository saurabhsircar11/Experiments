package com.example.root.myfactorypatterndemo;

/**
 * Created by root on 6/12/16.
 */

public class ChipFactory {
    public Chips getChipType(String chipType) {
        if (chipType == null) {
            return null;
        }
        if (chipType.equalsIgnoreCase("SALTEDSPECIAL")) {
            return new LaysSaltedSpecial();
        }
        if (chipType.equalsIgnoreCase("INDIANMASALA")) {
            return new LaysIndianMasala();
        }
        if (chipType.equalsIgnoreCase("ONIONANDCHEESE")) {
            return new LaysOnionAndChesse();
        }
        return null;

    }
}

package com.example.root.myfactorypatterndemo;

public class ChipFactory {
    public static final String SALTED = "SALTEDSPECIAL";
    public static final String MASALA = "INDIANMASALA";
    public static final String ONION = "ONIONANDCHEESE";

    /**
     *
     * @param chipType
     * @return
     */
    public Chips getChipType(String chipType) {
        switch (chipType) {
            case SALTED:
                return new LaysSaltedSpecial();
            case MASALA:
                return new LaysIndianMasala();
            default:
                return new LaysOnionAndChesse();
        }
    }
}

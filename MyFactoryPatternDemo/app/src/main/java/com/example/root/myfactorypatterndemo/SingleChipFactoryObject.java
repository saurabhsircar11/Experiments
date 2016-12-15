package com.example.root.myfactorypatterndemo;

public class SingleChipFactoryObject {
    public static final String MASALA = "masala";
    public static final String ONION = "onion";
    public static final String SALTED = "saled";
    private static ChipFactory chipFactory;
    private static SingleChipFactoryObject instance;

    private SingleChipFactoryObject() {
        chipFactory = new ChipFactory();
    }

    public static ChipFactory getInstance() {
        if (instance == null) {
            instance = new SingleChipFactoryObject();
        }
        return chipFactory;
    }
}

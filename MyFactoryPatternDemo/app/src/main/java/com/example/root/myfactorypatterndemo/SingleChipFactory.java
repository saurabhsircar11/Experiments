package com.example.root.myfactorypatterndemo;

public class SingleChipFactory {
    private static ChipFactory chipFactory;
    private static SingleChipFactory instance;

    private SingleChipFactory() {
        chipFactory = new ChipFactory();
    }

    public static ChipFactory getInstance() {
        if (instance == null) {
            instance = new SingleChipFactory();
        }
        return chipFactory;
    }
}

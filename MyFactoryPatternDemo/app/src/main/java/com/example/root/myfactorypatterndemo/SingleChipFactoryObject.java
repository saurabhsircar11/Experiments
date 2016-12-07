package com.example.root.myfactorypatterndemo;

/**
 * Created by root on 6/12/16.
 */

public class SingleChipFactoryObject {
    private static ChipFactory chipFactory;
    private static SingleChipFactoryObject instance;

    private SingleChipFactoryObject() {
        chipFactory = new ChipFactory();
    }

    public static ChipFactory getInstance() {
        if (instance != null) {
            return chipFactory;
        } else {
            instance = new SingleChipFactoryObject();
            return chipFactory;

        }
    }


}

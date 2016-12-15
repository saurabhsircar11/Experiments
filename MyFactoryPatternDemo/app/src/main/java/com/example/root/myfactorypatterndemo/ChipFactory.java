package com.example.root.myfactorypatterndemo;

import com.example.root.myfactorypatterndemo.interfaces.Chips;
import com.example.root.myfactorypatterndemo.models.LaysIndianMasalaModel;
import com.example.root.myfactorypatterndemo.models.LaysOnionAndChesseModel;
import com.example.root.myfactorypatterndemo.models.LaysSaltedSpecialModel;

/**
 * Created by root on 6/12/16.
 */

public class ChipFactory {

    /**
     * Function to get chip type.
     *
     * @param chipType String
     * @return Chips
     */
    public Chips getChipType(String chipType) {
        switch (chipType) {
            case SingleChipFactoryObject.MASALA:
                return new LaysIndianMasalaModel();
            case SingleChipFactoryObject.SALTED:
                return new LaysSaltedSpecialModel();
            default:
                return new LaysOnionAndChesseModel();
        }
    }
}

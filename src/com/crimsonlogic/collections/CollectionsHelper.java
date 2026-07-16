package com.crimsonlogic.collections;

import java.util.Scanner;

import com.crimsonlogic.collections.uerdefinedobjects.Arrayexample;
import com.crimsonlogic.collections.uerdefinedobjects.CargoShip;
import com.crimsonlogic.collections.uerdefinedobjects.CargoShipNotFoundException;
import com.crimsonlogic.collections.uerdefinedobjects.CargoShipOperations;
public class CollectionsHelper {

    public void helper() throws CargoShipNotFoundException {
        Arrayexample arr = new Arrayexample();
        arr.addCargoShip();
        arr.displayDetailsCargoShip();
    }
}

package com.crimsonlogic.collections.arraylist_example.cargo;

import com.crimsonlogic.collections.arraylist_example.cargo.CargoShipNotFoundException;
import com.crimsonlogic.collections.arraylist_example.employee.Arrayexample;

public class CollectionsHelper {

    public void helper() throws CargoShipNotFoundException {
        Arrayexample arr = new Arrayexample();
        arr.addCargoShip();
        arr.displayDetailsCargoShip();
    }
}

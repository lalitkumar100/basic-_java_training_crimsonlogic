package com.crimsonlogic.collections.uerdefinedobjects;

public class CargoShip {

    private int cargoShipId;
    private String cargoShipName;

    public int getCargoShipId() {
        return cargoShipId;
    }

    public void setCargoShipId(int cargoShipId) {
        this.cargoShipId = cargoShipId;
    }

    public String getCargoShipName() {
        return cargoShipName;
    }

    public void setCargoShipName(String cargoShipName) {
        this.cargoShipName = cargoShipName;
    }

    public float getCargoShipCapacity() {
        return cargoShipCapacity;
    }

    public void setCargoShipCapacity(float cargoShipCapacity) {
        this.cargoShipCapacity = cargoShipCapacity;
    }

    private float cargoShipCapacity;

    @Override
    public String toString() {
        return "cargoShip Capacity :"+getCargoShipCapacity()+"\n " +
                "cargoShip Name :"+getCargoShipName()+"\n" +
                "cargoShip Id :"+getCargoShipId();
    }
}

package org.fasttrackit;

public class Car extends Autovehicle {


    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    private int doorCount;


    public Car(Engine engine) {
        super(engine);
    }
}

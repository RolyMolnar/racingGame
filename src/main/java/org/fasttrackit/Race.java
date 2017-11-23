package org.fasttrackit;

public class Race {

    private Track track;
    private Car firstCompetitor;
    private Car secondCompetitor;

    public void start() {
        Engine engine = new Engine();
        engine.setManufacturer("Volvo");
        Engine engine2 = new Engine();
        engine2.setManufacturer("Honda");
        firstCompetitor=  createCompetitor(engine, "Volvo", "red", 40, 8.5,4);
        secondCompetitor=  createCompetitor(engine2, "Honda", "black", 50, 9.5,4);

    }


    private Car createCompetitor(Engine carEngine, String carName, String carColor, double carFuelLevel, double carMileage, int carDoorCount ) {
        Car competitor= new Car(carEngine);
        competitor.setName(carName);
        competitor.setColor(carColor);
        competitor.setFuelLevel(carFuelLevel);
        competitor.setMileage(carMileage);
        competitor.setDoorCount(carDoorCount);
        return competitor;

    };





    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Car getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Car firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Car getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Car secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}

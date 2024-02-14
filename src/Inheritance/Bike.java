package Inheritance;

public class Bike extends Transportation{

    private int bikePassengers;
    private int bikeWheels;


    public Bike(boolean safeMode, int numOfPassengers, int numOfWheels, int bikeWheels, int bikePassengers){
        super(safeMode, numOfPassengers, numOfWheels);
        this.bikePassengers = bikePassengers;
        this.bikeWheels = bikeWheels;
    }

    public int getBikePassengers() {
        return bikePassengers;
    }

    public void setBikePassengers(int bikePassengers) {
        this.bikePassengers = bikePassengers;
    }

    public int getBikeWheels() {
        return bikeWheels;
    }

    public void setBikeWheels(int bikeWheels) {
        this.bikeWheels = bikeWheels;
    }
}

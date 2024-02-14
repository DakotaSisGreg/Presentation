package Inheritance;

public class Car extends Transportation{

    private int carPassengers;
    private int carWheels;


    public Car(boolean safeMode, int numOfPassengers, int numOfWheels, int carPassengers, int carWheels){
        super(safeMode, numOfPassengers, numOfWheels);
        this.carPassengers = carPassengers;
        this.carWheels = carWheels;
    }

    public int getCarPassengers(){
        return carPassengers;
    }
    public int getCarWheels(){
        return carWheels;
    }

    public void setCarPassengers(int carPassengers) {
        this.carPassengers = carPassengers;
    }

    public void setCarWheels(int carWheels) {
        this.carWheels = carWheels;
    }
}

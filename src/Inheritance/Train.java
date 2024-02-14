package Inheritance;

public class Train  extends Transportation{

    private boolean  hasTracks;


public Train(boolean safeMode, int numOfPassengers, int numOfWheels, boolean hasTracks) {
    super(safeMode, numOfPassengers, numOfWheels);
    this.hasTracks = hasTracks;
    }
    public boolean hasTracks() {
    return hasTracks;
    }

    public void setHasTracks(boolean hasTracks) {
    this.hasTracks = hasTracks;
    }

}
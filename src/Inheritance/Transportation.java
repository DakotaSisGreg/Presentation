package Inheritance;

public class Transportation {
        protected boolean safeMode;
        protected int numOfWheels;
        protected int numOfPassengers;

        public Transportation(boolean safeMode, int numOfPassengers, int numOfWheels) {
            this.safeMode = safeMode;
            this.numOfWheels = numOfWheels;
            this.numOfPassengers = numOfPassengers;

        }

        public boolean safeMode() {
            return safeMode;
        }

    public boolean isSafeMode() {
        return safeMode;
    }

    public void setSafeMode(boolean safeMode) {
        this.safeMode = safeMode;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
}

package day04;

public class Car {

    int fuel;
    int distance;

    public Car() {
        fuel = 0;
        distance = 0;
    }

    public void setFuel(int liter) {
        this.fuel = liter;
        distance = 0;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getAverageFuelConsumption() {
        return fuel / ((double) distance / 100);
    }
}

package day04;

public class GasStation {

    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int fillCar(Car c, int liter) {
        c.setFuel(liter);
        return liter * price;
    }

}

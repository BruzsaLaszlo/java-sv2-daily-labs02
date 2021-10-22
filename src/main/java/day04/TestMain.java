package day04;

public class TestMain {

    public static void main(String[] args) {

        Car car = new Car();
        GasStation gs = new GasStation(450);

        int price = gs.fillCar(car, 50);
        System.out.println("A tankolás ára: " + price);
        car.setDistance(700);

        System.out.println("Átlagfogyasztás: " + car.getAverageFuelConsumption());
    }

}

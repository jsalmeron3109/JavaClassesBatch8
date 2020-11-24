package src.goupProject;

public interface Car {
    double carPrice = 0;
    String color = null;
    String calculateSalePrice(double carPrice, double x);
}
class Sedan implements Car {
    double carPrice;
    @Override
    public String calculateSalePrice(double carPrice, double length) {
        if (length > 20) {
            return "5% discount for Sedan: " + carPrice * .05 + " is your discount";
        } else {
            return "10% discount for Sedan: " + carPrice * .10 + " is your discount";
        }
    }
}
class Truck implements Car {
    double weight;
    @Override
    public String calculateSalePrice(double carPrice, double weight) {
        if (weight > 2000) {
            return "10% discount for Truck : " + carPrice * .10 + " is your discount";
        } else {
            return "20% discount for Truck : " + carPrice * .20 + " is your discount";
        }
    }
}
class MainTest {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        Truck truck = new Truck();
        String[] cars = {sedan.calculateSalePrice(50000, 23.0), sedan.calculateSalePrice(65000, 17),
                truck.calculateSalePrice(70000, 2500), truck.calculateSalePrice(100000, 1500)};
        for (String allCars:
                cars) {
            System.out.println(allCars);
        }
    }
}


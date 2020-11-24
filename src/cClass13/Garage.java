package src.cClass13;

public class Garage {
    public static void main(String[] args) {
        //retrieve objects from class

        Car Car1=new Car();
        Car1.NumberOfDoors=4;
        Car1.color="black";
        Car1.size=4;
        Car1.make="BMW";
        Car1.model="i8";

        Car Car2 = new Car();
        Car2.NumberOfDoors=2;
        Car2.color="Blue";
        Car2.size=2;
        Car2.make="Lamborghini";
        Car2.model="Gallardo";

        System.out.println("Car1.make"+Car1.make);
        System.out.println(Car2.make);


    }
}

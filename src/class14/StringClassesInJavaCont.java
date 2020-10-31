package class14;

public class StringClassesInJavaCont {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.make="Mac";
        laptop.model="MacBook Pro";
        laptop.storage=1;
        laptop.RAMCapacity=16;
        laptop.processor="Core i7";
        laptop.playMovies();
        laptop.videoCall("Work");
        String model=laptop.getModel();
        System.out.println(model);

    }
}

package src.class29;

public class Employee implements PrintInfo{
    @Override
    public void printName() {
        System.out.println(" Stephen");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("123456789");
    }

    @Override
    public void printAddress() {
        System.out.println(" VA");
    }
}

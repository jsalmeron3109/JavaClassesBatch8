package src.class29;

public class Student implements PrintInfo {
    @Override
    public void printName() {
        System.out.println("Jen");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("123456789");
    }

    @Override
    public void printAddress() {

        System.out.println(" bla bla bla USA");
    }
}

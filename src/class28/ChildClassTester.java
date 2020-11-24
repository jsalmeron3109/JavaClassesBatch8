package src.class28;

public class ChildClassTester {
    public static void main(String[] args) {
        ChildClass childClass=new ChildClass();
        childClass.printInfo();

        MyInterface myInterface=new ChildClass();
        myInterface.printInfo();
    }
}

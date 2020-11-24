package src.class21;

public class Child extends Father{//inherited from Father class which inherited from grandfather class
    public static void main(String[] args) {
        Child child=new Child();
        child.money=10;
        child.property="House";
        child.printF();
    }
}

package src.cClass13;

public class PhoneOperation {
    public static void main(String[] args) {
        SmartPhone MyPhone=new SmartPhone();
        MyPhone.brand="Apple";
        MyPhone.color="Black";
        MyPhone.model=" iphone";

        MyPhone.call("7032555333");
        MyPhone.text(" Hello");
        MyPhone.pics();
    }
}

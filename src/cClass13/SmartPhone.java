package src.cClass13;

public class SmartPhone {
    //print method to call
    String brand;
    String model;
    String color;
    void call(String phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void text(String text){
        System.out.println(brand+" "+model+" can text "+text);
    }
    void pics(){
        System.out.println(model+" can take a picture");
    }
}

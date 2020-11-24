package src.GeekSquadGroupProject;
public class Shapes {
    //Create an Interface 'Shape' with undefined methods as calculate Area and calculate Perimiter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    // Test your code
    public static void main(String[] args) {
        Circle circle=new Circle(3.5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        Square square=new Square(2.0);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
interface Shape{
        public  double calculateArea();
        public double calculatePerimeter();
}
 static class Circle implements Shape{
        double radius;
        double pi=3.14;
   public Circle(double radius1) {
        radius=radius1;
    }
     @Override
     public double calculateArea() {
         return pi*radius*radius;
     }
     @Override
     public double calculatePerimeter() {
         return 2*pi*radius;
     }
 }
static class Square implements Shape{
    double length;
    public Square(double a){
    a=length;
}
    @Override
    public double calculateArea() {
        return length*length;
    }
    @Override
    public double calculatePerimeter() {
        return 4*length;
    }
}
}

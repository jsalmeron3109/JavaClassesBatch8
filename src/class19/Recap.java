package class19;

public class Recap {
    //create a method that will accept an array as parameters & will return a sum of all elements from array
    //method should be visible only within same package and accessible by creating an instance of the class

    double sumArray(double[]array){
        double sum = 0;
        for (double v : array) {
            sum = sum + v;
        }
        return sum;
    }

}

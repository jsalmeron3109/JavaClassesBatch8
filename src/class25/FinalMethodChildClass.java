package src.class25;

public class FinalMethodChildClass extends FinalMethodClass {

    @Override
    double add(double num1, double num2) {
        double add= super.add(num1,num2);

        System.out.println("results in child class "+add);

        return add;
    }
}

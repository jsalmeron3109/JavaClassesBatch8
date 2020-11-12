package class19;

public class Task1 {
    /*
Write a program that will have a constructor:
one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.
 */
    public static class Student {
        String name;
        int age;
        char grade;
        double height;
        double weight;
        Student(){
        }
        Student( String nameValue, int ageValue, double heightValue, double weightValue){
           name=nameValue;
            age=ageValue;
           height=heightValue;
           weight=weightValue;

        }
        public static void main(String[] args) {
            Student s1= new Student();
            s1.name= "Jon";
            s1.age= 200;
            Student s2= new Student("Ben", 20, 200, 200);
        }

    }
}

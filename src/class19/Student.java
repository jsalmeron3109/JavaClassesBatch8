package class19;

public class Student {

     /*
     Write a java program of Class Students that takes students name and 3
     subject grades. Inside your class also have a method to Calculate
     Average Grade. Test Student class for 5 different students with different marks.
     Your program should print an average mark of each students name.
     NOTE: please use different names for instance and local variables

      */
     String name;
    double subject1;
    double subject2;
    double subject3;



     Student(String nameValue, double subject1Value, double subject2Value, double subject3Value) {
        name = nameValue;
        subject1 = subject1Value;
        subject2 = subject2Value;
        subject3 = subject3Value;
    }

    void printGradeAverage() {
        double avg = (subject1 + subject2 + subject3) / 3;
        System.out.println("Average marks for " + name + " are " + avg);
    }

    void printsubject1Marks(){

    }
    public static void main(String[] args) {
        Student student1 = new Student("Marta", 93, 90, 91);
        student1.printGradeAverage();
        Student student2 = new Student("Jack", 87, 80, 97);
        student2.printGradeAverage();
        Student student3 = new Student("Danilo", 100, 100, 100);
        student3.printGradeAverage();
        Student student4 = new Student("Maria", 98, 94, 96);
        student4.printGradeAverage();
        Student student5 = new Student("Nabin", 100, 100, 92);
        student5.printGradeAverage();
    }
}

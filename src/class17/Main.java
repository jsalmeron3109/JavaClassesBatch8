package src.class17;

public class Main {
    public static void main(String[] args) {
        Variables variables= new Variables();
        variables.varsDemo();
        variables.varsDemo1();

        Student student=new Student();
        student.name="Jen";
        student.age=28;
        student.marks=98;
        student.numberOfStudents++;

        student.printInfo();
        student.printMarks();
        student.studentsRegistered();

    }
}

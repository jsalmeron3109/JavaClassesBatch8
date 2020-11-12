package class17;

public class Student {
    String name; //declaring variables outside method
    int age;
    double marks;
   static int numberOfStudents=10;

    public void printInfo(){
        System.out.println("Name "+name+" Age "+age+" Marks "+marks);

    }
    public void printMarks(){
        System.out.println("Marks: "+marks);
    }
    public void studentsRegistered(){
        System.out.println("Total number of students until now: "+numberOfStudents);
    }
}

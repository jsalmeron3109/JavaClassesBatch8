package src.GeekSquadGroupProject;

//have to calculate the average of marks obtained in three subjects by student A and by student B.
// Create class'Marks'with an abstract method 'getPercentage' that will be returning the average percentage of marks.
// Provide implementation of abstract method in classes'A'and'B'.
// The constructor of student A takes the marks in three subjects as its parameters and the marks
// in four subjects as its parameters for student B.

public abstract class Marks {
    int subj1;
    int subj2;
    int subj3;
    int subj4;
    abstract double getPercentage();
}
class StudentA extends Marks {
    @Override
    double getPercentage() {
        return (subj1 + subj2 + subj3)/3;
    }
    public StudentA(int subj1, int subj2, int subj3) {
        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3 = subj3;
    }
}
class StudentB extends Marks {
    @Override
    double getPercentage() {
        return (subj1 + subj2 + subj3 + subj4)/4;
    }
    public StudentB(int subj1, int subj2, int subj3, int subj4) {
        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3 = subj3;
        this.subj4 = subj4;
    }
}
class Main {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(70, 90, 50);
        StudentB studentB = new StudentB(40, 80, 100, 80);
        Marks[] marks = {studentA, studentB};
        for (Marks students:
                marks) {
            System.out.println(students.getPercentage());
        }
}
}

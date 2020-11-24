package src.class23;

public class Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree you need a high school diploma");
    }
}
class Bachelors extends Degree {
}
class Masters extends Degree {

    public void getPrerequisite() {
        System.out.println("To get a masters degree you need a bachelors degree");
    }
}
class Test {
    public static void main(String[] args) {
        Degree obj1 = new Degree();
        Bachelors obj2 = new Bachelors();
        Masters obj3 = new Masters();
        obj1.getPrerequisite();
        obj2.getPrerequisite();
        obj3.getPrerequisite();
    }
}

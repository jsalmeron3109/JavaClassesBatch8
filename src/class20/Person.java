package class20;

public class Person {

    String name;
    int age;
    String id;
    String phone;
    char gender;
    char maritalStatus;
    double height;
    double weight;

    Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    Person(String name, int age, String phone,char gender, double height, double weight) {
        this(name, age, phone);//shorter way with repetitive constructors
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Person person=new Person("Jen",28,"555-555-5555");
        Person person1=new Person("Mila",30,"800-333-4455",'F',5.9,121);
    }
}


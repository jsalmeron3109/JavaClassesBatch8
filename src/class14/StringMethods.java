package class14;

public class StringMethods {
    public static void main(String[] args) {


        String string = "Hello World";
        String string1 = new String("Hello World");

        //length
        String name = "Jen";
        System.out.println(name.length());//prints length of the string (3 letters)
        name="";
        System.out.println(name.length());
        name="Jen Salmeron";
        System.out.println(name.length());
    }
}

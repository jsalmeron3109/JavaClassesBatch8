package src.class15;

public class StringBuilderClass1 {
    public static void main(String[] args) {
        //strings are not modifiable
        StringBuilder stringBuilder=new StringBuilder("Hello ");
        stringBuilder.append("World");//append will add
        System.out.println(stringBuilder);//prints Hello World

        String string="Hello";
        string.concat("World");
        System.out.println(string);//will only print Hello, original string cannot be modified
    }
}

package class19;

public class Recap2 {
//create method that will take a string as a parameter and returns reversed string.
// Method should be available to all classes
    public static String reverseString(String string){
        StringBuilder stringBuilder= new StringBuilder(string);
       return stringBuilder.reverse().toString();
    }
}

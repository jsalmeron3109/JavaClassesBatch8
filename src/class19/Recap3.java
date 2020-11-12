package class19;

public class Recap3 {
    //create a method that will accept a Sting as a parameter and return a new string that consists of only vowels
    //Method should be available inside the class only where it was declared and executed by calling its name

    private static String vowelsOnly(String name){
        return name.replaceAll("[^AEIOUaeiou]","");
    }

    public static void main(String[] args) {
        System.out.println(vowelsOnly("all the vowels will be removed"));
    }
}

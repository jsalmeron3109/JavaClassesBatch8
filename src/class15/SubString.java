package class15;

public class SubString {
    public static void main(String[] args) {
        String phrase="can you write the second e too?";
        System.out.println(phrase.substring(7));//will ignore the first 6 characters
        System.out.println(phrase.substring(0));
        System.out.println(phrase.substring(5,10));//will print range characters from 5-10 position only

    }
}

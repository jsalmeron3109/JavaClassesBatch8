package class14;

public class IsEmptyMethod {
    public static void main(String[] args) {
        String name="Maria";
        System.out.println(name.isEmpty());//treats as boolean, prints false
        //returns true if string is empty
        name="";
        System.out.println(name.isEmpty());
    }
}

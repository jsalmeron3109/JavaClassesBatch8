package class15;

public class CharAt {
    public static void main(String[] args) {
        String var="never"; //everything stored in a string is an array of char characters
        System.out.println(var.charAt(0));//n
        System.out.println(var.charAt(1));//e
        System.out.println(var.charAt(3));//e

        for (int i=0;i<var.length();i++){
            System.out.println(var.charAt(i));
        }
    }
}

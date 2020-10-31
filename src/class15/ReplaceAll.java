package class15;

public class ReplaceAll {
    public static void main(String[] args) {
       String mix="321Hello 89 World354545 *&***^&^&";

        System.out.println(mix.replaceAll("[0-9]",""));//replacing numbers with nothing
        System.out.println(mix.replaceAll("[a-z]",""));//will replace all lower case
        System.out.println(mix.replaceAll("[a-z A-Z]",""));//replace upper and lowwer case
        System.out.println(mix.replaceAll("[^A-Za-z0-9]",""));


    }
}

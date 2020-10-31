package class14;

public class StartsWithMethod {
    public static void main(String[] args) {
        //checks if string starts with specific prefix

        String name="Jenifer";
        System.out.println(name.startsWith("Miss"));//will print boolean false b.c String does not start with Miss

        name="Miss Jenifer";
        System.out.println(name.startsWith("Miss"));//will print true
        System.out.println(name.startsWith("M"));//will print true
        System.out.println(name.startsWith("m"));// false b.c case sensitive
    }
}

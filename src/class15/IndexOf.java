package class15;

public class IndexOf {
    public static void main(String[] args) {
        String names="Jenifer";
        System.out.println(names.indexOf('f'));//will print the position for char character (4)
        System.out.println(names.indexOf('e'));//will print first e in string and stop iteration (1)
        System.out.println(names.indexOf('z'));//will print -1 for characters not in string
    }
}


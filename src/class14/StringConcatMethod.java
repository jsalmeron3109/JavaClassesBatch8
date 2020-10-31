package class14;

import com.sun.javaws.IconUtil;

public class StringConcatMethod {
    public static void main(String[] args) {
        String firstName="Jenifer";
        String lastName=" Salmeron";
        String completeName=firstName.concat(lastName);//concat can only be done once
        System.out.println(completeName);
        //vs.

        System.out.println(firstName+lastName);//can be done with multiple variables
    }
}

package class16;

import java.util.Arrays;

public class ReverseWordsWithStringBuilder {
    public static void main(String[] args) {
        String sentence="Hello it is Sunday";
        String [] stringArray=sentence.split( " ");

        System.out.println(Arrays.toString(stringArray));
        for (int i=0;i<stringArray.length;i++){
            StringBuilder stringBuilder= new StringBuilder(stringArray[i]);
            System.out.print(stringBuilder);
            stringArray[i]=stringBuilder.reverse().toString();
            System.out.print(stringArray[i]);

        }
        System.out.println(Arrays.toString(stringArray));
    }
}

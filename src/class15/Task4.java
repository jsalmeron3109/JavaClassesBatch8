package src.class15;

public class Task4 {
    public static void main(String[] args) {
        //reverse a string
        String value = "navaeh";
        for (int i = value.length() - 1; i >= 0; i--) {
            System.out.print(value.charAt(i));

            //Task2:
            String str = "I love coding and Java";
            String a[] = str.split(" ");
            for (int j = a.length - 1; j >= 0; j--) {
                System.out.print(a[j] + " ");
            }
        }

    }
}

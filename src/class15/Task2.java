package class15;

public class Task2 {
    public static void main(String[] args) {
        //create string combination of letters, numbers, special characters
        //find how many alpha characters there are
        String mix = "OJSw-3859$%8gfve0 injwrf3#%4UERFcE3R2%$*@";
        String newMix = mix.replaceAll("[^0-9]", "");//^=not, this will replace everything except numbers
        System.out.println("Alpha characters amount: "+ newMix.length());

    }
}

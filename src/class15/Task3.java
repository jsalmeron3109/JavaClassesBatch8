package src.class15;

public class Task3 {
    public static void main(String[] args) {
        //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String
        String a="Is it saturday?Is it raining? Do we have a Java Class today?";
        int sum=0;
        String [] b=a.split("[?]");
        for (String sen1:b) {
            sum++;
        }
        System.out.println(sum);
        }
    }


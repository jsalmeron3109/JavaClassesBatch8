package src.class17;

public class MainTask {
    public static void main(String[] args) {
        Task1 task1=new Task1();
        String email = task1.createEmail("Jen", "Salmeron", "icloud");
        System.out.println(email);

        Task2 task2=new Task2();
        boolean prime=task2.isPrime(25);
       boolean prime1= task2.isPrime(1);
        boolean prime2=task2.isPrime(10);
        System.out.println("isPrime(25) "+prime);
        System.out.println("isPrime(1) "+prime1);
        System.out.println("isPrime(10) "+prime2);
    }


    }


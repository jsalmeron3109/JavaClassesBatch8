package class17;

public class Task2 {
    //write a method to return whether given number is prime or not, what is prime number?

    boolean isPrime(int number){
        boolean isPrime=true;
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}

package src.class23;

class Bank{
    double bankBalance;
    public Bank(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    void printTransferFee(){
        System.out.println("Transfer fee= "+bankBalance*0.1);
    }
}

class BankOfAmerica extends Bank{

    public BankOfAmerica(double bankBalance) {
        super(bankBalance);
    }
}
class Chase extends Bank{
    public Chase(double bankBalance){
        super(bankBalance);
    }

    void printTransferFee() {
        System.out.println("Transfer fee= "+bankBalance*.01);
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Chase chase= new Chase(1000);
        chase.printTransferFee();
        BankOfAmerica boa=new BankOfAmerica(1000);
        boa.printTransferFee();
    }
}

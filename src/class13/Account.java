package class13;

public class Account {

    String accountId;
    String userName;
    String password;
    double balance;
    String typeOfAccount;
    double limit;

    double amountTransfer(double amountToTransfer) {
        if (amountToTransfer < balance) {
            return balance = balance - amountToTransfer;
        } else {
            return 0;
        }
    }


    //write a method that takes the amount that user wants to transfer
    //transfer it deducts the amount from your balance and
    //retuens the amount of transfer in case of success or a 0 in case of failure
    boolean login(String enteredUserName, String enteredPassword){
        if(userName.equals(enteredUserName)&&password.equals(enteredPassword)){
            return true;
        }else{
            return false;
        }


    }

    }



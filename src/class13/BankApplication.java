package class13;

public class BankApplication {
    private static Object enteredPassword;
    private static String enteredUserName;

    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.accountId="123";
        myAccount.userName="Jen";
        myAccount.password="pass123";
        myAccount.balance= 1000;
        myAccount.typeOfAccount="checking";
        myAccount.limit=125;



        boolean isLoggedIn= myAccount.login("jen","123");
        System.out.println(isLoggedIn);

        if(isLoggedIn){
            System.out.println("Welcome to Syntax Bank");
        }else{
            System.out.println("Invalid username or password");
        }


        System.out.println(myAccount.userName);

    }
}

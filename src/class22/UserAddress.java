package src.class22;

public class UserAddress extends UserClass{
    String userAddress;
    UserAddress(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.userAddress=address;

    }

    void userDetails(){
        System.out.println("User name is "+super.getName()+" has a phone number "
        +super.getMobileNumber()+" and lives in "+userAddress);
    }

    public static void main(String[] args) {
        UserAddress userAddress=new UserAddress("Jen","1234567890","San Diego,CA");
        userAddress.userDetails();

    }
}

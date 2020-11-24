package src.class21;

public class Me extends Mom{
    Me(){
        System.out.println("Constructor from me");
    }
    Me(int money){
        super(money);
    }

    public static void main(String[] args) {
        Me me=new Me(1000);
        me.print();

    }
}

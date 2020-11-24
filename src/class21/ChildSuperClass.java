package src.class21;

public class ChildSuperClass extends ParentSuperClass{
    ChildSuperClass(int money){
        super(money);//using super keyword I can refer to parent class this sends variable money to parent class
        System.out.println("From Child Super Class");
    }

    void marry(){
        super.marry();//super class lets me marry Channing tatum and Zac Efron :D !!
        System.out.println("I will marry Zac Efron and inherit "+money);
    }

    public static void main(String[] args) {
        ChildSuperClass childSuperClass= new ChildSuperClass(1000);
        childSuperClass.marry();
    }
}

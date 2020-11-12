package class17;

public class Variables {
    public int instanceNum=45;
    public void varsDemo(){
        int num1=10;//local variable
        if(num1>10){
            int num2=90;//variable inside brackets cannot be accessed
        }
        System.out.println(num1);
    }
    public void varsDemo1(){
       int num2=-10;
        System.out.println(num2);
    }
}

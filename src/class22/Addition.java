package src.class22;

public class Addition {
    //method overloading example

    int sum (int num1,int num2){
        return num1+num2;
    }
    int sum (int num1,int num2, int num){
        return num1+num2+num;
    }
    int sum (int []numArray){
        int sum=0;
        for(int num:numArray){
            sum=sum+num;
        }
        return sum;
    }

}

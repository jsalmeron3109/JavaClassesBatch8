package src.class22;

public class MethodOverloading {

    public void print(){
        System.out.println("Print with no arguments ");
    }
    public void print(String name){//first method passing string
        System.out.println("Hello "+name);
    }
    //we can distinguish btw different methods by method signature
    //method signature=combination of method name & type of parameters that we are passing as argument
    //and the sequence of parameters
    public void print(String name, int number){//second method passing string and int
        System.out.println("String name, int number");
    }
    public void print(int number, String name){//switching int and String is one way of overloading method
        System.out.println("name "+name+" number "+number);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.print();
        methodOverloading.print("name");
        methodOverloading.print("name",123);
        methodOverloading.print(123,"name");


    }

}


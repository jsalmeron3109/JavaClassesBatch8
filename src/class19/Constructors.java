package class19;

import com.sun.tools.internal.jxc.ap.Const;

public class Constructors {

     int number;
     String name;
     char character;

    Constructors(){
         System.out.println("I will be called everytime you create an object");
     }
     Constructors(int numberValue,String nameValue, char characterValue){
         System.out.println("I am not a useless constructor, I am initializing your fields");
       number=numberValue;
       name=nameValue;
       character=characterValue;

     }
    void  print(){
        System.out.println("Number "+number+" Name "+name+" character "+character);
    }

    public static void main(String[] args) {
         Constructors constructors= new Constructors(100,"Jen",'A');
        //Constructors
        //Constructors name of the variable
        //=assignment
        //new (want an object)
        //Constructors()
        //purpose of constructors is to initialize our fields
        System.out.println(constructors.number);
    }
}

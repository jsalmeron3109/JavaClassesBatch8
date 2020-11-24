package src.class23;

public class ParentTester {
    public static void main(String[] args) {
        //Parent parent =new Parent();
        //parent.sleep();
        //parent.eat();

        //parent= new Me();
        //parent.eat();
        //parent.sleep();

        //parent= new Brother();
        //parent.eat();
        //parent.sleep();

       //another form of polymorphism
        Parent parent=new Parent();
        Parent []familyArray=new Parent[3];
        familyArray[0]=new Parent();
        familyArray[1]=new Brother();
        familyArray[2]=new Me();

        for(Parent par:familyArray){
            par.eat();
            par.sleep();
        }


    }
}

package src.class24;

public class Dog {
    void bark() {
        System.out.println("Dog barks");
    }

    void sleep() {
        System.out.println("Dog sleeps");
    }

    void eat() {
        System.out.println("Dog eats");
    }

    void appearance() {
        System.out.println("I don't have any appearance");
    }
}

    class Cockapoo extends Dog {
        void appearance() {
            System.out.println("I have cockapoo");
        }

        void sleep() {
            System.out.println("I sleep 16 hours");
        }
    }

     class Chow extends Dog{
            void appearance(){
                System.out.println("I have a Chow");
            }
            void special(){
                System.out.println("I love kids");
            }
            void hunt(){
                System.out.println("Hunt squirrels");
            }
     }







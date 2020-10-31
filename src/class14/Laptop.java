package class14;

public class Laptop {
    String make;
    String model;
    int storage;
    int RAMCapacity;
    String processor;

    void playMovies(){
        System.out.println("Playing movies");
    }
    void videoCall(String contact){
        System.out.println("Video call "+contact);
    }

    public String getModel(){
        return model;
    }
}

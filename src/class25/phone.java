package src.class25;

abstract public class phone {
    public void makeCalls(){
        System.out.println("phone makes call");
    }
    public void sendText(){
        System.out.println("phone sends text");
    }
   abstract public void viewPicture();//must make class abstract
    public abstract void unlock();

    }
class Iphone extends phone{//must implement abstract methods from phone parent class

    @Override
    public void viewPicture() {
        System.out.println("we can check pictures using camera roll");
    }
    @Override
    public void unlock() {
        System.out.println("unlock phone with face recognition");
    }
}
class Samsung extends phone{//have to implement methods again from phone parent class
    @Override
    public void viewPicture() {
        System.out.println("Use gallery to access pictures");
    }
    @Override
    public void unlock() {
        System.out.println("unlock phone using password");
    }
}
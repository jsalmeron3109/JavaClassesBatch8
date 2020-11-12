package class21;

public class Mom {
    int money;
    Mom(){
        System.out.println("Constructor from mom");
    }
    Mom(int money){
        this.money=money;

    }
    void print(){
        System.out.println("Mom has "+money+" saved");
    }
}


package class15;

public class Split {
    public static void main(String[] args) {
        String name="Jen^&Maria**Victor Paola";
        String[]array=name.split("[^A-Z a-z]");
        for(String name1:array
        ){
        System.out.print(name1);
        }
    }
}

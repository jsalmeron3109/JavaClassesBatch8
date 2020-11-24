package src.class27;

public class StringPool {
    public static void main(String[] args) {
        String name="LOL";
        String name1="LOL";
        System.out.println(name==name1);//prints true
        System.out.println(name.equals(name1));//prints true
        String name2=new String("LOL");
        System.out.println(name==name2);//prints false
        System.out.println(name.equals(name2));//prints true

        //second declaration for name2 declared in heap, new object stored therefore == will only compare addresses

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("naknok");

        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("anknden");
    }
}

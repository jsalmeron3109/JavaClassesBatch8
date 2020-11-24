package src.class20;

public class Book {
    String title;
    int year;
    Book(){
        System.out.println("This is a constructor with no arguments");
    }
    Book(String title,int year){
        this.year=year;
        this.title=title;
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.title+" "+book1.year);
        Book book2 = new Book("The Four Agreements ",1997);
        System.out.println(book2.title+" "+book2.year);
    }
}

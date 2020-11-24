package src.class24;

public class Main {
    public static void main(String[] args) {
        Book[] books=new Book[2];

        Student[] students=new Student[3];
        Book book1=new Book("HarryPotter","HarryPotter",
                "jk rowling",1999,"123",true);
        Book book2=new Book("Java","Java",
                "Aladin",1995,"12345",true);

        books[0]=book1;
        books[1]=book2;

        Student student=new Student("Jen","Jen123",28);
        Student student1=new Student("Victor","Vic123",32);
        Student student2=new Student("Student","Student123",27);
        students[0]=student;
        students[1]=student1;
        students[2]=student2;
        Librarian librarian=new Librarian("Molly","Molly123");
        Library library=new Library("Syntax Library",books,students,librarian);



    }
}

package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author michaelBulgakov = new Author("Michael", "Bulgakov");
        Book firstBook = new Book("dog's heart", michaelBulgakov, 1925);
        System.out.println(firstBook);
        Book secondBook = new Book("Amazing Spider-Man Omnibus",new Author("Sten","Lee"),2007);
        firstBook.setPuplishYear("");
        System.out.println(firstBook.getPublishYear(1));
    }
}

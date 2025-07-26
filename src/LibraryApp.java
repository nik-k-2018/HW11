// LibraryApp.java
public class LibraryApp {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);
        Book book3 = new Book("Война и мир", author1, 1869); // такая же, как book1

        // Проверка toString()
        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        System.out.println();

        // Проверка equals()
        System.out.println("book1.equals(book3): " + book1.equals(book3)); // true
        System.out.println("book1.equals(book2): " + book1.equals(book2)); // false
        System.out.println();

        // Проверка hashCode()
        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode());
        System.out.println("Hash codes equal: " + (book1.hashCode() == book3.hashCode())); // true
    }
}
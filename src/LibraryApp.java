// LibraryApp.java
public class LibraryApp {
    public static void main(String[] args) {
        // Создаём авторов
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");

        // Создаём книги
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        // Выводим информацию о книгах
        System.out.println("Книга 1: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации: " + book1.getPublicationYear());

        System.out.println();

        System.out.println("Книга 2: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год публикации: " + book2.getPublicationYear());

        // Меняем год публикации у первой книги
        book1.setPublicationYear(1870);
        System.out.println("\nГод публикации 'Войны и мира' изменён на " + book1.getPublicationYear());
    }
}
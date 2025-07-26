// Book.java
public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    // Конструктор
    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Сеттер только для года публикации
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
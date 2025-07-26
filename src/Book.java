// Book.java
public class Book {
    private String title;
    private Author author;
    private int publicationYear;

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

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // toString() — используем toString() автора, не дублируем!
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +  // вызовется author.toString()
                ", publicationYear=" + publicationYear +
                '}';
    }

    // equals() — сравниваем все поля
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    // hashCode() — согласован с equals
    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + publicationYear;
        return result;
    }
}
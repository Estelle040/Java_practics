import java.lang.*;
public class Book {
    // Поля (атрибуты) класса
    private String title;
    private String author;
    private int yearPublished;

    // Конструктор класса
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Методы доступа (геттеры и сеттеры) для полей
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String toString() {
        return "Книга: " + title + ", Автор: " + author + ", Год издания: " + yearPublished;
    }
}


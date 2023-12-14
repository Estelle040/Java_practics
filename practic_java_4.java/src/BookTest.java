public class BookTest {
    public static void main(String[] args) {
        // Создаем объект книги
        Book book = new Book("Преступление и наказание", "Федор Достоевский", 1866);

        // Выводим информацию о книге
        System.out.println(book);

        // Изменяем название книги
        book.setTitle("Идиот");
        System.out.println("Новое название книги: " + book.getTitle());

        // Изменяем год написания книги
        book.setYear(1869);
        System.out.println("Новый год написания книги: " + book.getYear());

        // Изменяем автора книги
        book.setAuthor("Федор Достоевский (Псевдоним Михаил Достоевский)");
        System.out.println("Новый автор книги: " + book.getAuthor());
    }
}

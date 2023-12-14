public class testAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Ivan Popov", "ivPopov@somewhere.com", 'M');
        Author author2 = new Author("Anna Ivanova", "anIvanova@somewhere.com", 'F');
        Author author3 = new Author("Alex Smith", "alex@smith.com", 'P');

        System.out.println("Информация об авторах:");
        System.out.println(author1.toString());
        System.out.println(author2.toString());
        System.out.println(author3.toString());

        String authorName = author2.getName();
        System.out.println("Имя автора: " + authorName);

        char authorGender = author2.getGender();
        System.out.println("Пол автора: " + authorGender);
    }
}

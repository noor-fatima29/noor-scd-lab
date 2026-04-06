public class Main3 {
    public static void main(String[] args) {

        Book book1 = new Book("Popular makeup tips", "Noor Fatima");
        Book book2 = new Book("SCD Book");


        book1.borrowBook();
        book1.borrowBook();

        book1.returnBook();
        book1.borrowBook();

        System.out.println("Book Status:");
        System.out.println(book1.getTitle() + " | Available: " + book1.isAvailable());
        System.out.println(book2.getTitle() + " | Available: " + book2.isAvailable());
    }
}
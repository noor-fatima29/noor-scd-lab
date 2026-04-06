public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println("Error: " + title + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (isAvailable) {
            System.out.println("Borrow the book");
        } else {
            System.out.println(title + ": Returned");
            isAvailable = true;
        }
    }
}
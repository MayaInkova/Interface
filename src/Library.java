import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
        Library library = new Library();

        // Добавяне на книги в библиотеката
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));

        // Показване на всички книги
        System.out.println("All books in the library:");
        library.displayAllBooks();

        // Търсене на книга по заглавие
        String searchTitle = "1984";
        Book foundBook = library.findBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("\nBook found: " + foundBook);
        } else {
            System.out.println("\nBook with title '" + searchTitle + "' not found.");
        }
    }
}




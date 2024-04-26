import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Client> clients;
    private List<Book> availableBooks;
    private List<Book> borrowedBooks;

    public Library() {
        this.clients = new ArrayList<>();
        this.availableBooks = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }

    public void borrowBook(Client client, Book book) {
        if (availableBooks.contains(book)) {
            availableBooks.remove(book);
            borrowedBooks.add(book);
            client.borrowBook(book);
            System.out.println("Book '" + book.getJudul() + "' borrowed successfully by " + client.getNama());
        } else {
            System.out.println("Book '" + book.getJudul() + "' is not available.");
        }
    }

    public void returnBook(Client client, Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            availableBooks.add(book);
            client.returnBook(book);
            System.out.println("Book '" + book.getJudul() + "' returned successfully by " + client.getNama());
        } else {
            System.out.println("Book '" + book.getJudul() + "' is not borrowed by " + client.getNama());
        }
    }
}

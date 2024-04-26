import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Client {
    private String nimNik;
    private String nama;
    private String fakDep;
    private String prodi;
    private double jDenda;
    private int pDenda;
    private List<Book> borrowedBooks;
    private List<CD> borrowedcd;

    public Client(String nimNik, String nama, String fakDep, String prodi, double jDenda, int pDenda) {
        this.nimNik = nimNik;
        this.nama = nama;
        this.fakDep = fakDep;
        this.prodi = prodi;
        this.jDenda = jDenda;
        this.pDenda = pDenda;
        this.borrowedBooks = new ArrayList<>();
        this.borrowedcd = new ArrayList<>();
    }

    public String getNimNik() {
        return nimNik;
    }

    public void setNimNik(String nimNik) {
        this.nimNik = nimNik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFakDep() {
        return fakDep;
    }

    public void setFakDep(String fakDep) {
        this.fakDep = fakDep;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public double getjDenda() {
        return jDenda;
    }

    public void setjDenda(double jDenda) {
        this.jDenda = jDenda;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    public int getpDenda() {
        return pDenda;
    }

    public void setpDenda(int pDenda) {
        this.pDenda = pDenda;
    }

    public List<CD> getBorrowedcd() {
        return borrowedcd;
    }

    public void returnCD(CD cd) {
        this.borrowedcd.remove(cd);
    }

    public double calculateFine(Date dueDate) {
        // Calculate the number of days the client is late
        long diff = new Date().getTime() - dueDate.getTime();
        long daysLate = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        // Calculate the fine amount based on the number of days late
        double fineAmount = daysLate * 0.5; // Assuming a fine of $0.50 per day
        return fineAmount;
    }

    public void payFine(double amount) {
        this.jDenda -= amount;
    }
}

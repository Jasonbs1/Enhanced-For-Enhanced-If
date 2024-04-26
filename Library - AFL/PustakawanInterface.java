import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class PustakawanInterface {
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<CD> cds = new ArrayList<>();
    private ArrayList<Kategori> kategoris = new ArrayList<>();
    private ArrayList<Pengarang> pengarangs = new ArrayList<>();
    private ArrayList<Penerbit> penerbits = new ArrayList<>();

    public void InterfacePustakawan() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome, Pustakawan!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Manage Client");
            System.out.println("2. Manage Book");
            System.out.println("3. Manage CD");
            System.out.println("4. Manage Kategori");
            System.out.println("5. Manage Pengarang");
            System.out.println("6. Manage Penerbit");
            System.out.println("7. Generate Report");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manageClient();
                    break;
                case 2:
                    manageBook();
                    break;
                case 3:
                    manageCD();
                    break;
                case 4:
                    manageKategori();
                    break;
                case 5:
                    managePengarang();
                    break;
                case 6:
                    managePenerbit();
                    break;
                case 7:
                    generateReports();
                    break;
                case 8:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Client Management
    private void manageClient() {
        Scanner scanner = new Scanner(System.in);
        boolean managingClients = true;

        while (managingClients) {
            System.out.println("\nManage Clients:");
            System.out.println("1. Add Client");
            System.out.println("2. Delete Client");
            System.out.println("3. Show All Clients");
            System.out.println("4. Go Back");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addClient();
                    break;
                case 2:
                    deleteClient();
                    break;
                case 3:
                    showAllClients();
                    break;
                case 4:
                    managingClients = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private void addClient() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter client details:");

        System.out.print("NIM/NIK: ");
        String nimNik = scanner.nextLine();

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Fak/Dep: ");
        String fakDep = scanner.nextLine();

        System.out.print("Prodi: ");
        String prodi = scanner.nextLine();

        System.out.print("J_Denda: ");
        double jDenda = scanner.nextDouble();

        System.out.print("P_Denda: ");
        int pDenda = scanner.nextInt();

        clients.add(new Client(nimNik, nama, fakDep, prodi, jDenda, pDenda));

        System.out.println("Client added successfully.");
        scanner.close();
    }

    private void deleteClient() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter NIM/NIK of client to delete: ");
        String nimNik = scanner.nextLine();

        boolean found = false;
        for (Client client : clients) {
            if (client.getNimNik().equals(nimNik)) {
                clients.remove(client);
                System.out.println("Client deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Client not found.");
            scanner.close();
        }
    }

    private void showAllClients() {
        if (clients.isEmpty()) {
            System.out.println("No clients found.");
        } else {
            System.out.println("\nAll Clients:");
            for (Client client : clients) {
                System.out.println(client);
            }
        }
    }

// Book Management
private void manageBook() {
    Scanner scanner = new Scanner(System.in);
    boolean managingBooks = true;

    while (managingBooks) {
        System.out.println("\nManage Books:");
        System.out.println("1. Add Book");
        System.out.println("2. Delete Book");
        System.out.println("3. Show All Books");
        System.out.println("4. Go Back");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                deleteBook();
                break;
            case 3:
                showAllBooks();
                break;
            case 4:
                managingBooks = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    scanner.close();
}

private void addBook() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nEnter book details:");

    System.out.print("ISBN/ISSN: ");
    String isbn = scanner.nextLine();

    System.out.print("Judul: ");
    String judul = scanner.nextLine();

    System.out.print("Tahun Terbit: ");
    int tahunTerbit = scanner.nextInt();

    System.out.print("Edisi: ");
    int edisi = scanner.nextInt();

    System.out.print("Jenis Sampul: ");
    int jenisSampul = scanner.nextInt();

    System.out.print("Jumlah Pinjam: ");
    int jPinjam = scanner.nextInt();

    System.out.print("Jumlah Rusak: ");
    int jRusak = scanner.nextInt();

    System.out.print("Jumlah Total: ");
    int jTotal = scanner.nextInt();

    System.out.print("Jumlah Tersedia: ");
    int jTersedia = scanner.nextInt();

    // Create a new Book object
    Book book = new Book(isbn, judul, tahunTerbit, edisi, jenisSampul, jPinjam, jRusak, jTotal, jTersedia, null, null, null);

    // Add the book to the list of books
    books.add(book);

    System.out.println("Book added successfully.");
    scanner.close();
}

private void deleteBook() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter ISBN/ISSN of book to delete: ");
    String isbn = scanner.nextLine();

    boolean found = false;
    for (Book book : books) {
        if (book.getIsbn().equals(isbn)) {
            books.remove(book);
            System.out.println("Book deleted successfully.");
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Book not found.");
    }
    scanner.close();
}

private void showAllBooks() {
    if (books.isEmpty()) {
        System.out.println("No books found.");
    } else {
        System.out.println("\nAll Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

}

// CD Management
private void manageCD() {
    Scanner scanner = new Scanner(System.in);
    boolean managingCDs = true;

    while (managingCDs) {
        System.out.println("\nManage CDs:");
        System.out.println("1. Add CD");
        System.out.println("2. Delete CD");
        System.out.println("3. Show All CDs");
        System.out.println("4. Go Back");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                addCD();
                break;
            case 2:
                deleteCD();
                break;
            case 3:
                showAllCDs();
                break;
            case 4:
                managingCDs = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    scanner.close();
}

private void addCD() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nEnter CD details:");

    System.out.print("KD_CD: ");
    String kdCD = scanner.nextLine();

    System.out.print("Judul: ");
    String judul = scanner.nextLine();

    System.out.print("Tahun Terbit: ");
    int tahunTerbit = scanner.nextInt();

    System.out.print("Jumlah Pinjam: ");
    int jPinjam = scanner.nextInt();

    System.out.print("Jumlah Rusak: ");
    int jRusak = scanner.nextInt();

    System.out.print("Jumlah Total: ");
    int jTotal = scanner.nextInt();

    System.out.print("Jumlah Tersedia: ");
    int jTersedia = scanner.nextInt();

    // Create a new CD object
    CD cd = new CD(kdCD, judul, tahunTerbit, jPinjam, jRusak, jTotal, jTersedia);

    // Add the CD to the list of CDs
    cds.add(cd);

    System.out.println("CD added successfully.");
    scanner.close();
}

private void deleteCD() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter KD_CD of CD to delete: ");
    String kdCD = scanner.nextLine();

    boolean found = false;
    for (CD cd : cds) {
        if (cd.getKdCd().equals(kdCD)) {
            cds.remove(cd);
            System.out.println("CD deleted successfully.");
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("CD not found.");
    }
    scanner.close();
}

private void showAllCDs() {
    if (cds.isEmpty()) {
        System.out.println("No CDs found.");
    } else {
        System.out.println("\nAll CDs:");
        for (CD cd : cds) {
            System.out.println(cd);
        }
    }
}

// Kategori Management
private void manageKategori() {
    Scanner scanner = new Scanner(System.in);
    boolean managingKategori = true;

    while (managingKategori) {
        System.out.println("\nManage Kategori:");
        System.out.println("1. Add Kategori");
        System.out.println("2. Delete Kategori");
        System.out.println("3. Show All Kategori");
        System.out.println("4. Go Back");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                addKategori();
                break;
            case 2:
                deleteKategori();
                break;
            case 3:
                showAllKategori();
                break;
            case 4:
                managingKategori = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    scanner.close();
}

private void addKategori() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nEnter Kategori details:");

    System.out.print("KD_Kat: ");
    String kdKat = scanner.nextLine();

    System.out.print("Nama: ");
    String nama = scanner.nextLine();

    System.out.print("Deskripsi: ");
    String deskripsi = scanner.nextLine();

    // Create a new Kategori object
    Kategori kategori = new Kategori(kdKat, nama, deskripsi);

    // Add the Kategori to the list of Kategori
    kategoris.add(kategori);

    System.out.println("Kategori added successfully.");
    scanner.close();
}

private void deleteKategori() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter KD_Kat of Kategori to delete: ");
    String kdKat = scanner.nextLine();

    boolean found = false;
    for (Kategori kategori : kategoris) {
        if (kategori.getKdKat().equals(kdKat)) {
            kategoris.remove(kategori);
            System.out.println("Kategori deleted successfully.");
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Kategori not found.");
    }
    scanner.close();
}

private void showAllKategori() {
    if (kategoris.isEmpty()) {
        System.out.println("No Kategori found.");
    } else {
        System.out.println("\nAll Kategori:");
        for (Kategori kategori : kategoris) {
            System.out.println(kategori);
        }
    }
}

// Pengarang Management
private void managePengarang() {
    Scanner scanner = new Scanner(System.in);
    boolean managingPengarang = true;

    while (managingPengarang) {
        System.out.println("\nManage Pengarang:");
        System.out.println("1. Add Pengarang");
        System.out.println("2. Delete Pengarang");
        System.out.println("3. Show All Pengarang");
        System.out.println("4. Go Back");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                addPengarang();
                break;
            case 2:
                deletePengarang();
                break;
            case 3:
                showAllPengarang();
                break;
            case 4:
                managingPengarang = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    scanner.close();
}

private void addPengarang() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nEnter Pengarang details:");

    System.out.print("ID_Pengarang: ");
    String idPengarang = scanner.nextLine();

    System.out.print("Nama: ");
    String nama = scanner.nextLine();

    System.out.print("Alamat: ");
    String alamat = scanner.nextLine();

    System.out.print("No Telp: ");
    String noTelp = scanner.nextLine();

    System.out.print("Email: ");
    String email = scanner.nextLine();

    // Create a new Pengarang object
    Pengarang pengarang = new Pengarang(idPengarang, nama, alamat, noTelp, email);

    // Add the Pengarang to the list of Pengarang
    pengarangs.add(pengarang);

    System.out.println("Pengarang added successfully.");
    scanner.close();
}

private void deletePengarang() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter ID_Pengarang of Pengarang to delete: ");
    String idPengarang = scanner.nextLine();

    boolean found = false;
    for (Pengarang pengarang : pengarangs) {
        if (pengarang.getIdPengarang().equals(idPengarang)) {
            pengarangs.remove(pengarang);
            System.out.println("Pengarang deleted successfully.");
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Pengarang not found.");
    }
    scanner.close();
}

private void showAllPengarang() {
    if (pengarangs.isEmpty()) {
        System.out.println("No Pengarang found.");
    } else {
        System.out.println("\nAll Pengarang:");
        for (Pengarang pengarang : pengarangs) {
            System.out.println(pengarang);
        }
    }
}

// Penerbit Management
private void managePenerbit() {
    Scanner scanner = new Scanner(System.in);
    boolean managingPenerbit = true;

    while (managingPenerbit) {
        System.out.println("\nManage Penerbit:");
        System.out.println("1. Add Penerbit");
        System.out.println("2. Delete Penerbit");
        System.out.println("3. Show All Penerbit");
        System.out.println("4. Go Back");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                addPenerbit();
                break;
            case 2:
                deletePenerbit();
                break;
            case 3:
                showAllPenerbit();
                break;
            case 4:
                managingPenerbit = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    scanner.close();
}

private void addPenerbit() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nEnter Penerbit details:");

    System.out.print("ID_Penerbit: ");
    String idPenerbit = scanner.nextLine();

    System.out.print("Nama: ");
    String nama = scanner.nextLine();

    System.out.print("Alamat: ");
    String alamat = scanner.nextLine();

    System.out.print("No Telp: ");
    String noTelp = scanner.nextLine();

    System.out.print("Email: ");
    String email = scanner.nextLine();

    // Create a new Penerbit object
    Penerbit penerbit = new Penerbit(idPenerbit, nama, alamat, noTelp, email);

    // Add the Penerbit to the list of Penerbit
    penerbits.add(penerbit);

    System.out.println("Penerbit added successfully.");
    scanner.close();
}

private void deletePenerbit() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter ID_Penerbit of Penerbit to delete: ");
    String idPenerbit = scanner.nextLine();

    boolean found = false;
    for (Penerbit penerbit : penerbits) {
        if (penerbit.getIdPenerbit().equals(idPenerbit)) {
            penerbits.remove(penerbit);
            System.out.println("Penerbit deleted successfully.");
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Penerbit not found.");
    }
    scanner.close();
}

private void showAllPenerbit() {
    if (penerbits.isEmpty()) {
        System.out.println("No Penerbit found.");
    } else {
        System.out.println("\nAll Penerbit:");
        for (Penerbit penerbit : penerbits) {
            System.out.println(penerbit);
        }
    }
}
    
// Generate Report
    private void generateReports() {
        System.out.println("Generating Reports...");

        try {
            // Create a FileWriter to write data to a text file
            FileWriter writer = new FileWriter("library_report.txt");

            // Write Books
            writer.write("Books:\n");
            for (Book book : books) {
                writer.write(book.toString() + "\n");
            }
            writer.write("\n");

            // Write CDs
            writer.write("CDs:\n");
            for (CD cd : cds) {
                writer.write(cd.toString() + "\n");
            }
            writer.write("\n");

            // Write Categories
            writer.write("Categories:\n");
            for (Kategori kategori : kategoris) {
                writer.write(kategori.toString() + "\n");
            }
            writer.write("\n");

            // Write Pengarangs
            writer.write("Pengarangs:\n");
            for (Pengarang pengarang : pengarangs) {
                writer.write(pengarang.toString() + "\n");
            }
            writer.write("\n");

            // Write Penerbits
            writer.write("Penerbits:\n");
            for (Penerbit penerbit : penerbits) {
                writer.write(penerbit.toString() + "\n");
            }
            writer.write("\n");

            // Close the FileWriter
            writer.close();

            System.out.println("Reports generated successfully.");
        } catch (IOException e) {
            System.out.println("Error: Unable to generate reports.");
            e.printStackTrace();
        }
    }
}


import java.util.Date;
import java.util.Scanner;

public class ClientInterface {
    private Scanner scanner;

    public ClientInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        Client client = null;
        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Borrow Book");
            System.out.println("2. Borrow CD");
            System.out.println("3. Manage Fine");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (client != null)
                        borrowBook(client);
                    else
                        System.out.println("Please register first.");
                    break;
                case 2:
                    if (client != null)
                        borrowCD(client);
                    else
                        System.out.println("Please register first.");
                    break;
                case 3:
                    if (client != null)
                        manageFine(client);
                    else
                        System.out.println("Please register first.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
    }


    private void returnBook(Client client) {
        System.out.println("\nReturn Book");
    
        if (!client.getBorrowedBooks().isEmpty()) {
            System.out.println("Your borrowed books:");
            int i = 1;
            for (Book book : client.getBorrowedBooks()) {
                System.out.println(i++ + ". " + book.getJudul() + " by " + book.getPengarang());
            }
    
            System.out.print("Enter the number of the book you want to return: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
    
            if (choice >= 1 && choice <= client.getBorrowedBooks().size()) {
                Book bookToReturn = client.getBorrowedBooks().get(choice - 1);
                client.returnBook(bookToReturn);
            } else {
                System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("You haven't borrowed any books.");
        }
    }
    

    private void borrowCD(Client client) {
        // Implement borrowing CD functionality
    }


    private void returnCD(Client client) {
        System.out.println("\nReturn CD");
    
        if (!client.getBorrowedcd().isEmpty()) {
            System.out.println("Your borrowed CDs:");
            int i = 1;
            for (CD cd : client.getBorrowedcd()) {
                System.out.println(i++ + ". " + cd.getJudul());
            }
    
            System.out.print("Enter the number of the CD you want to return: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
    
            if (choice >= 1 && choice <= client.getBorrowedcd().size()) {
                CD cdToReturn = client.getBorrowedcd().get(choice - 1);
                client.returnCD(cdToReturn);
                System.out.println("CD '" + cdToReturn.getJudul() + "' returned successfully by " + client.getNama());
            } else {
                System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("You haven't borrowed any CDs.");
        }
    }


    // Fine Management
    private void manageFine(Client client) {
        int choice;
        do {
            System.out.println("\nManage Fine");
            System.out.println("1. Check Fine");
            System.out.println("2. Pay Fine");
            System.out.println("3. Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
    
            switch (choice) {
                case 1:
                    checkFine(client);
                    break;
                case 2:
                    payFine(client);
                    break;
                case 3:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        } while (choice != 3);
    }


    private void checkFine(Client client) {
        double fine = client.calculateFine(new Date());
        System.out.println("Total Fine for " + client.getNama() + ": " + fine);
    }

    private void payFine(Client client) {
        double fine = client.calculateFine(new Date());
        if (fine > 0) {
            System.out.println("Total Fine for " + client.getNama() + ": " + fine);
            System.out.print("Enter the amount to pay: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            if (amount >= fine) {
                client.payFine(amount);
            } else {
                System.out.println("Invalid amount. Please pay the total fine.");
            }
        } else {
            System.out.println("No fine to pay for " + client.getNama() + ".");
        }
    }
}

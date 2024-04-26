import java.util.Date;
import java.util.Scanner;

public class ClientInterface {
    private Scanner scanner;
    private Library library;

    public ClientInterface(Library library) {
        this.library = library;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        Client client = null;
        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Register");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Borrow CD");
            System.out.println("5. Return CD");
            System.out.println("6. Manage Fine");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    if (client != null)
                        borrowBook(client);
                    else
                        System.out.println("Please register first.");
                    break;
                case 3:
                    if (client != null)
                        returnBook(client);
                    else
                        System.out.println("Please register first.");
                    break;
                case 4:
                    if (client != null)
                        borrowCD(client);
                    else
                        System.out.println("Please register first.");
                    break;
                case 5:
                    if (client != null)
                        returnCD(client);
                    else
                        System.out.println("Please register first.");
                    break;
                case 6:
                    if (client != null)
                        manageFine(client);
                    else
                        System.out.println("Please register first.");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);
    }

    private void register() {
        System.out.println("\nRegister Client");
        System.out.print("Enter NIM/NIK: ");
        String nimNik = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Faculty/Department: ");
        String facultyDepartment = scanner.nextLine();
        System.out.print("Enter Program: ");
        String program = scanner.nextLine();
        System.out.print("Enter Fine Rate per Day: ");
        double fineRate = scanner.nextDouble();
        System.out.print("Enter Fine Threshold: ");
        int fineThreshold = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Client newClient = new Client(nimNik, name, facultyDepartment, program, fineRate, fineThreshold);
        library.addClient(newClient);
        System.out.println("Client registered successfully.");
    }

    private void borrowBook(Client client) {
        System.out.println("\nBorrow Book");
        // Implement borrowing book functionality
    }

    private void returnBook(Client client) {
        System.out.println("\nReturn Book");
        // Implement returning book functionality
    }

    private void borrowCD(Client client) {
        System.out.println("\nBorrow CD");
        // Implement borrowing CD functionality
    }

    private void returnCD(Client client) {
        System.out.println("\nReturn CD");
        // Implement returning CD functionality
    }

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
                System.out.println("Fine paid successfully.");
            } else {
                System.out.println("Invalid amount. Please pay the total fine.");
            }
        } else {
            System.out.println("No fine to pay for " + client.getNama() + ".");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Library Management System");
            System.out.println("Select your role:");
            System.out.println("1. Pustakawan");
            System.out.println("2. Client");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    PustakawanInterface pustakawanInterface = new PustakawanInterface();
                    pustakawanInterface.InterfacePustakawan();
                    break;
                case 2:
                    Library library = new Library();
                    ClientInterface clientInterface = new ClientInterface(library);
                    clientInterface.start();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

class ReservationSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("===== Login Form =====");
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (authenticateUser(username, password)) {
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
                System.out.println();
            }
        }

        System.out.println("===== Online Reservation System =====");
        System.out.println("1. Reservation Form");
        System.out.println("2. Cancellation Form");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                showReservationForm();
                break;
            case 2:
                showCancellationForm();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static boolean authenticateUser(String username, String password) {
        // Hardcoded values for demonstration purposesadmin
        String hardcodedUsername = "admin";
        String hardcodedPassword = "password";

        return username.equals(hardcodedUsername) && password.equals(hardcodedPassword);
    }

    private static void showReservationForm() {
        System.out.println("===== Reservation Form =====");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter train number: ");
        String trainNumber = scanner.nextLine();

        System.out.print("Enter class type: ");
        String classType = scanner.nextLine();

        System.out.print("Enter date of journey: ");
        String dateOfJourney = scanner.nextLine();

        System.out.print("Enter from (place): ");
        String fromPlace = scanner.nextLine();

        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        // Perform insert logic here
        // Save the reservation details to the database or perform any required operations
        System.out.println("Reservation inserted successfully!");
    }

    private static void showCancellationForm() {
        System.out.println("===== Cancellation Form =====");
        System.out.print("Enter your PNR number: ");
        String pnrNumber = scanner.nextLine();

        // Retrieve the reservation details using the PNR number from the database
        // Display the details to the user

        System.out.print("Press OK to confirm cancellation (Y/N): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {
            // Perform cancellation logic here
            // Delete the reservation from the database or perform any required operations
            System.out.println("Cancellation confirmed!");
        } else {
            System.out.println("Cancellation not confirmed.");
        }
    }
}

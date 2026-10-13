//Develop a console based system that allows student to create a bank account and perform basic banking operations such as account creation, main menu that is repeatedly displayed, deposit money, withdraw money, check balance, display account details calculate interest, and exit the system. The system should use object-oriented programming principles and handle user input appropriately.(Using switch case)
import java.util.Scanner;

public class BankAccount {
    private final String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" Amount must be greater than zero.\n");
            return;
        }
        balance += amount;
        System.out.println(" Deposit successful! New balance: Rs. " + balance + "\n");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Amount must be greater than zero.\n");
        } else if (amount > balance) {
            System.out.println(" Insufficient balance.\n");
        } else {
            balance -= amount;
            System.out.println(" Withdrawal successful! New balance: Rs. " + balance + "\n");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs. " + balance + "\n");
    }

    public void calculateInterest() {
        final double annualInterestRate = 4.0;
        double interest = balance * annualInterestRate / 100;
        System.out.println("\nAnnual interest at " + annualInterestRate + "%: Rs. " + interest);
        System.out.println("Balance after interest: Rs. " + (balance + interest));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;
        boolean accountCreated = false;

        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║  WELCOME TO BANKING SYSTEM         ║");
        System.out.println("╚════════════════════════════════════╝\n");

        // Account creation
        if (!accountCreated) {
            System.out.println("--- Create Your Account ---\n");
            
            System.out.print("Enter Account Holder Name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println(" Name cannot be empty!");
                scanner.close();
                return;
            }

            System.out.print("Enter Account Number: ");
            String accNumber = scanner.nextLine().trim();
            if (accNumber.isEmpty()) {
                System.out.println(" Account number cannot be empty!");
                scanner.close();
                return;
            }

            System.out.print("Enter Initial Balance (Rs.): ");
            double initialBalance = getValidPositiveDouble(scanner);
            if (initialBalance < 0) {
                System.out.println(" Initial balance cannot be negative!");
                scanner.close();
                return;
            }

            account = new BankAccount(name, initialBalance);
            accountCreated = true;
            System.out.println("✓ Account created successfully!\n");
        }

        // Main menu loop
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = getValidMenuChoice(scanner);

            switch (choice) {
                case 1:
                    // Deposit
                    System.out.print("\nEnter amount to deposit (Rs.): ");
                    double depositAmount = getValidPositiveDouble(scanner);
                    if (depositAmount > 0) {
                        account.deposit(depositAmount);
                    }
                    break;

                case 2:
                    // Withdraw
                    System.out.print("\nEnter amount to withdraw (Rs.): ");
                    double withdrawAmount = getValidPositiveDouble(scanner);
                    if (withdrawAmount > 0) {
                        account.withdraw(withdrawAmount);
                    }
                    break;

                case 3:
                    // Check Balance
                    System.out.println("\n Current Balance: Rs. " + account.getBalance() + "\n");
                    break;

                case 4:
                    // Display Account Details
                    account.displayDetails();
                    break;

                case 5:
                    // Calculate Interest
                    account.calculateInterest();
                    System.out.println();
                    break;

                case 6:
                    // Exit
                    System.out.println("\n╔════════════════════════════════════╗");
                    System.out.println("║  THANK YOU FOR USING OUR BANK       ║");
                    System.out.println("║  Final Balance: Rs. " + account.getBalance() + "       ║");
                    System.out.println("╚═════════════════════════════════════╝\n");
                    exit = true;
                    break;

                default:
                    // This should not happen due to validation, but just in case
                    System.out.println(" Invalid choice! Please enter a number between 1 and 6.\n");
                    break;
            }
        }

        scanner.close();
    }

    // Display menu options
    private static void displayMenu() {
        System.out.println("\n========== MAIN MENU ==========");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Display Account Details");
        System.out.println("5. Calculate Interest");
        System.out.println("6. Exit");
        System.out.println("===============================");
        System.out.print("Enter your choice (1-6): ");
    }

    // Get valid menu choice (1-6)
    private static int getValidMenuChoice(Scanner scanner) {
        int choice = -1;
        try {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println(" Input cannot be empty!");
                return getValidMenuChoice(scanner);
            }
            choice = Integer.parseInt(input);
            if (choice < 1 || choice > 6) {
                System.out.println(" Invalid choice! Please enter a number between 1 and 6.");
                System.out.print("Enter your choice (1-6): ");
                return getValidMenuChoice(scanner);
            }
        } catch (NumberFormatException e) {
            System.out.println(" Invalid input! Please enter a valid number.");
            System.out.print("Enter your choice (1-6): ");
            return getValidMenuChoice(scanner);
        }
        return choice;
    }

    // Get valid positive double input
    private static double getValidPositiveDouble(Scanner scanner) {
        double amount = -1;
        try {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println(" Input cannot be empty!");
                System.out.print("Please enter a valid amount: ");
                return getValidPositiveDouble(scanner);
            }
            amount = Double.parseDouble(input);
            if (amount < 0) {
                System.out.println(" Amount cannot be negative!");
                System.out.print("Please enter a valid amount: ");
                return getValidPositiveDouble(scanner);
            }
        } catch (NumberFormatException e) {
            System.out.println(" Invalid input! Please enter a valid number.");
            System.out.print("Please enter a valid amount: ");
            return getValidPositiveDouble(scanner);
        }
        return amount;
    }
}

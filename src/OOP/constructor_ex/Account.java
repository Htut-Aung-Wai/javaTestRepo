package OOP.constructor_ex;

// Define the Account class
public class Account {
    // Private instance variables
    private String accountNumber;
    private double balance;

    // Parameterized constructor with validation
    public Account(String accountNumber, double balance) {
        // Validate accountNumber
        if (accountNumber == null || accountNumber.isEmpty()) {
            // Print error message if accountNumber is null or empty
            System.out.println("Error: Account number cannot be null or empty.");
            return;
        }
        // Validate balance
        if (balance < 0) {
            // Print error message if balance is negative
            System.out.println("Error: Balance cannot be negative.");
            return;
        }
        // Initialize accountNumber with the provided parameter
        this.accountNumber = accountNumber;
        // Initialize balance with the provided parameter
        this.balance = balance;
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Test with valid data
        Account account1 = new Account("12340009", 1000.00);
        System.out.println("Account 1 Number: " + account1.accountNumber);
        System.out.println("Account 1 Balance: " + account1.balance);

        // Test with invalid accountNumber
        Account account2 = new Account("", -400.00);
        System.out.println("Account 2 Number: " + account2.accountNumber);
        System.out.println("Account 2 Balance: " + account2.balance);
        // Test with invalid balance
        Account account3 = new Account("1230000873", -200.00);
        System.out.println("Account 3 Number: " + account3.accountNumber);
        System.out.println("Account 3 Balance: " + account3.balance);
    }
}


// wrong account variable and don't test balance and return so if account is wrong ,balance is default number


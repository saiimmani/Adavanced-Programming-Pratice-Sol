public class BankAccount {
    private static final double MIN_BALANCE = 0.0; // Minimum balance allowed
    private String accountNumber;
    private double balance;

    // Constructor to initialize the account with an initial balance
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(initialBalance, MIN_BALANCE); // Ensure initial balance is not below MIN_BALANCE
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance - MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance - MIN_BALANCE) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 100.0);
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(50.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(30.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        account.withdraw(150.0); // This should trigger insufficient funds message
        System.out.println("Balance after failed withdrawal: " + account.getBalance());
    }
}


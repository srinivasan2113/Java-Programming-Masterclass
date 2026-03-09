import java.util.Random;

public class StudentAccount {

    // ================= PRIVATE VARIABLES =================
    private final String accountNumber;
    private String studentName;
    private final String collegeName;
    private double balance;
    private String password;
    private boolean isLocked;
    private int failedAttempts;
    private String[] transactionHistory;
    private int transactionIndex;

    private static int totalAccounts = 0;

    // ================= CONSTRUCTOR =================
    public StudentAccount(String studentName, String collegeName, double initialBalance, String password) {

        if (studentName == null || studentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }
 
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters.");
        }

        this.studentName = studentName;
        this.collegeName = collegeName;
        this.balance = initialBalance;
        this.password = password;
        this.isLocked = false;
        this.failedAttempts = 0;
        this.transactionHistory = new String[5];
        this.transactionIndex = 0;

        this.accountNumber = generateAccountNumber();
        totalAccounts++;

        logTransaction("Account created with balance: " + initialBalance);
    }

    // ================= PRIVATE METHODS =================

    private String generateAccountNumber() {
        Random random = new Random();
        int number = 1000 + random.nextInt(9000);
        return "SBI-2026-" + number;
    }

    private void logTransaction(String message) {
        transactionHistory[transactionIndex % 5] = message;
        transactionIndex++;
    }

    private boolean authenticate(String inputPassword) {
        if (isLocked) {
            System.out.println("Account is locked.");
            return false;
        }

        if (password.equals(inputPassword)) {
            failedAttempts = 0;
            return true;
        } else {
            failedAttempts++;
            System.out.println("Incorrect password.");

            if (failedAttempts >= 3) {
                isLocked = true;
                System.out.println("Account locked due to 3 failed attempts.");
            }
            return false;
        }
    }

    // ================= PUBLIC METHODS =================

    public void deposit(double amount) {
        if (isLocked) {
            System.out.println("Account is locked. Deposit denied.");
            return;
        }

        if (amount > 0) {
            balance += amount;
            logTransaction("Deposited: " + amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount, String inputPassword) {
        if (!authenticate(inputPassword)) {
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            logTransaction("Withdrawn: " + amount);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (!authenticate(oldPassword)) {
            return;
        }

        if (newPassword == null || newPassword.length() < 6) {
            System.out.println("New password must be at least 6 characters.");
            return;
        }

        this.password = newPassword;
        logTransaction("Password changed.");
        System.out.println("Password updated successfully.");
    }

    public void printTransactionHistory() {
        System.out.println("---- Last 5 Transactions ----");
        for (String transaction : transactionHistory) {
            if (transaction != null) {
                System.out.println(transaction);
            }
        }
    }

    public void displayAccountDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("College Name: " + collegeName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Locked: " + isLocked);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

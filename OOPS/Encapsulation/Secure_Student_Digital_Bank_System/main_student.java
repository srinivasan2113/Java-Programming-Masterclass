
public class main_student {

    public static void main(String[] args) {

        // Create Account 1
        StudentAccount s1 = new StudentAccount(
                "Saran",
                "Rajiv Gandhi College of Engineering and Technology",
                5000,
                "secure123"
        );

        // Create Account 2
        StudentAccount s2 = new StudentAccount(
                "Srini",
                "Rajiv Gandhi College of Engineering and Technology",
                3000,
                "mypassword"
        );

        // Perform Transactions
        s1.deposit(2000);
        s1.withdraw(1000, "secure123");

        // Try wrong password 3 times
        s1.withdraw(500, "wrong1");
        s1.withdraw(500, "wrong2");
        s1.withdraw(500, "wrong3"); // should lock account

        // Try deposit after lock
        s1.deposit(1000);

        // Change password attempt after lock
        s1.changePassword("secure123", "newpass123");

        // Print Details
        s1.displayAccountDetails();
        s1.printTransactionHistory();

        System.out.println("Total Accounts Created: " + StudentAccount.getTotalAccounts());
    }
}

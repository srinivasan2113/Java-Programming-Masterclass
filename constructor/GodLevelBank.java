

public class GodLevelBank {

    // ===== Static Branch Info =====
    static String branchName1 = "ICIC BANK";
    static int branchCode1 = 6020;
    static String IFSC1 = "ICI0006020";
    static String location1 = "Vadapalani";
    static String specialOffer1 = "2% interest for deposits >50,000";

    static String branchName2 = "SBI BANK";
    static int branchCode2 = 1010;
    static String IFSC2 = "SBI0001010";
    static String location2 = "Tambaram";
    static String specialOffer2 = "Free debit card";

    // ===== Static Counters =====
    static int totalAccounts = 0;
    static double totalBankBalance = 0;

    // ===== Non-Static User Info =====
    String userName;
    String dob;
    long phNo;
    double balance;
    String address;
    long accountNumber; 

    // ===== Static Account Number Generator =====
    static long accountCounter = 100000;

    // ===== Constructor =====  
    GodLevelBank(String name, String date, long tel, double amount, String add) {
        this.userName = name;
        this.dob = date;
        this.phNo = tel;
        this.balance = amount;
        this.address = add;
        this.accountNumber = generateAcNo();

        // Update static totals
        totalAccounts++;
        totalBankBalance += amount; 
    }

    // ===== Generate Unique Account Number =====
    long generateAcNo() {
        accountCounter++;
        return accountCounter;
    }

    // ===== User Actions =====
    void deposit(double amount) {
        balance += amount;
        totalBankBalance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            totalBankBalance -= amount;
        } else {
            System.out.println("Insufficient balance for " + userName);
        }
    }

    void transfer(GodLevelBank receiver, double amount) {
        if (balance >= amount) {
            balance -= amount;
            receiver.balance += amount;
            // No change in totalBankBalance because money moves between users
        } else {
            System.out.println("Insufficient balance to transfer from " + userName + " to " + receiver.userName);
        }
    }

    // ===== Display User Details =====
    void showUserDetails() {
        System.out.println("User: " + userName);
        System.out.println("DOB: " + dob);
        System.out.println("Phone: " + phNo);
        System.out.println("Balance: " + balance);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Address: " + address);
        System.out.println("----------------------------");
    }

    // ===== Display Branch Info =====
    static void showBranchInfo() {
        System.out.println("Branch Name: " + branchName1);
        System.out.println("Branch Code: " + branchCode1);
        System.out.println("IFSC: " + IFSC1);
        System.out.println("Location: " + location1);
        System.out.println("Special Offer: " + specialOffer1);
        System.out.println("----------------------------");

        System.out.println("Branch Name: " + branchName2);
        System.out.println("Branch Code: " + branchCode2);
        System.out.println("IFSC: " + IFSC2);
        System.out.println("Location: " + location2);
        System.out.println("Special Offer: " + specialOffer2);
        System.out.println("----------------------------");
    }

    // ===== Display System-Wide Stats =====
    static void showSystemStats() {
        System.out.println("Total Accounts Created: " + totalAccounts);
        System.out.println("Total Bank Balance: " + totalBankBalance);
        System.out.println("=============================");
    }

    // ===== Main Method =====
    public static void main(String[] args) {

        // Show branch info without creating users
        showBranchInfo();

        // Create Users
        GodLevelBank user1 = new GodLevelBank("Srini", "13/03/2004", 6374056261L, 50000, "Pondicherry");
        GodLevelBank user2 = new GodLevelBank("Arun", "20/07/2003", 9876543210L, 80000, "Chennai");

        // Transactions
        user1.deposit(20000);          // Srini deposits 20k
        user2.withdraw(500000);          // Arun withdraws 5k
        user1.transfer(user2, 15000);  // Srini transfers 15k to Arun

        // Show User Details
        user1.showUserDetails();
        user2.showUserDetails();

        // Show System-Wide Stats
        showSystemStats();
    }
}

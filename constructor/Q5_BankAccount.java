//Create a class BankAccount using a parameterized constructor with accountNumber and balance. 
// If the balance is less than 1000, automatically set it to 1000.

public class Q5_BankAccount {

    long AccountNumber;
    int initialBalance;
    int Balance=0;

    Q5_BankAccount( long num,int bal)
    {
        AccountNumber=num;
        initialBalance=bal;

        if(initialBalance<1000)
        {
            Balance=1000;
        }
        else{
            Balance=initialBalance;
        }
    }

    void display()
    {
         System.out.println("_________INPUT_________");
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Initial Balance: "+initialBalance);
        System.out.println("_________OUTPUT_________");
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Balance: "+Balance);
    }

    public static void main(String args[])
    {
        Q5_BankAccount P1=new Q5_BankAccount(987654L,500);
        P1.display();
    }
    
}

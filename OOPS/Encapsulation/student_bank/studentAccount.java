package OOPS.Encapsulation.student_bank;

public class studentAccount {
    private String accountnumber;
    private String studentName;
    private double balance;
    private String collegeName;


    public double getBalance()
{
    return balance;
}



public studentAccount(String accountnumber,String studentName,double amount,String collegeName)
{
    if(studentName==null|| studentName.trim().isEmpty())
    {
        throw new IllegalArgumentException("Student name cannot be null");
    }
    this.accountnumber=accountnumber;
    this.studentName=studentName;
    this.balance=amount;
    this.collegeName=collegeName;

    

}

public void deposit(double amount)
{
    if(amount>0)
    {
    balance+=amount;
    System.out.println("Deposit successful.");
    }
    else {
    System.out.println("Invalid amount.");
}


}

public void withdraw(double amount)
{
    if(amount>0)
    {
    if(balance>=amount)
    {
        balance-=amount;
        System.out.println("withdrawal successful.");
    }
    else{
        System.out.println("insufficient balance.");
    }
    
}else {
    System.out.println("Invalid amount.");
}



}
public void display()
{
    System.out.println("Student Name: "+studentName);
    System.out.println("Account Number: "+accountnumber);
    System.out.println("balance: "+getBalance());
    System.out.println("college: "+collegeName);
}


}

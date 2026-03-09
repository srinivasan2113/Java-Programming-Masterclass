package static_and_non_static.statics;

public class Q1_bank {


    static{
        System.out.println("\t\t\t welcome the bank application");
    }
    static String bankName;
    static String branch;
    static String IFSC;
    static int branchCode;
    static String location;

    static{
        bankName="ICIC BANK";
        branch="vadapalani";
        IFSC="ICI0006020";
        branchCode=006020;
        location="chennai, vadapalani, 590007";
    }

    String userName;
    String dob;
    long phNo;
    double balance;
    String address;
    long accountNumber;

    Q1_bank(String name,String date,long tel,double amount,String add)
    {
        userName=name;
        dob=date;
        phNo=tel;
        balance=amount;
        address=add;
        accountNumber=generateAcno();
    }


    int generateAcno(){
        int acno=(int)(Math.random()*899999)+100000;
        return acno;
    }

    public static void bankDetail()
    {
        System.out.println("bank name is :"+bankName);
        System.out.println("bank branch is :"+branch);
        System.out.println("bank IFSC code is :"+IFSC);
        System.out.println("bank code is :"+branchCode);
        System.out.println("bank Adress is :"+location);
        

        System.out.println("_______________________________");
    }

    void userDetails()
    {
        System.out.println("username : "+userName);
        System.out.println("date of Birth : "+dob);
        System.out.println("user phno. : "+phNo);
        System.out.println("user bank balance : "+balance);
        System.out.println("bank Accountnumber is :"+accountNumber);
        System.out.println("user address: "+address);
    }


    public static void main(String args[])
    {
        Q1_bank p1=new Q1_bank("srini","13/03/2004",6374056261L,50000," pondicherry,ariyankuppam");
        bankDetail();
        p1.userDetails();
        System.out.println("Generated Account Number: " + p1.accountNumber);
    }
    
}

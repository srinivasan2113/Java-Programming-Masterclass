public class orglevelbank {


    //static variable

    //bank ICIC
    static String branchname1;
    static int branchcode1;
    static String IFSC1;
    static String location1;
    static String offer1;
    //bank SBI
    static String branchname2;
    static int branchcode2;
    static String IFSC2;
    static String location2;
    static String offer2;
    //total bank
    static int totalaccounts;
    static int totalbankbalance;
    static int counter;

    static{
        //bank ICIC
        branchname1="ICIC Bank";
        branchcode1=6020;
        IFSC1="ICI0006020";
        location1="pondicherry";
        offer1="2% interest for deposit > 50000";

        //bank SBI
        branchname2="SBI Bank";
        branchcode2=1010;
        IFSC2="SBI0001010";
        location2="chennai";
        offer2="Free debit card";

        //total bank
        totalaccounts=0;
        totalbankbalance=0;
        counter=10000;
    }

    

//NON_static
    //user account
    String username;
    String dob;
    long phno;
    int balance;
    String address;
    int accountnumber;


//CONSTRUCTOR
    orglevelbank(String name,String birth,long tele,int amount,String add)
    {
        username=name;
        dob=birth;
        phno=tele;
        balance=amount;
        address=add;
        accountnumber=getaccountnumber();





        totalaccounts++;
        totalbankbalance+=amount;

    }
      

    int getaccountnumber()
    {
        counter++;
        return counter;
    }


    //deposit
    void desposit(int amount)
    {
        balance+=amount;
        totalbankbalance+=amount;
    }

    //withdraw
    void withdraw(int amount)
    {
        if( balance>=amount)
        {
            balance-=amount;
            totalbankbalance-=amount;
        }
        else{
            System.out.println("insufficient bank balance");
        }
    }

    //transfer
    void transfer(orglevelbank reciver,int amount)
    {
        if(balance>=amount)
        {
        balance-=amount;
        reciver.balance+=amount;
        }
        else
        {
            System.out.println("insufficient bank balance");
        }
    }



    //display

    //user output
    void user()
    {
        System.out.println("________________USERS____________________________");
        System.out.println("name: "+username);
        System.out.println("date of birth: "+dob);
        System.out.println("phone Number: "+phno);
        System.out.println("balance: "+balance);
        System.out.println("address: "+address);
        System.out.println("accountnumber: "+accountnumber);

    }

    static void bankdata(){
        System.out.println("___________________BANK ONE______________________");
        System.out.println("Brance name: "+branchname1);
        System.out.println("Branch code: "+branchcode1);
        System.out.println("IFSC: "+IFSC1);
        System.out.println("Location: "+location1);
        System.out.println("Special Offers: "+offer1);
        System.out.println("___________________BANK TWO______________________");
         System.out.println("Brance name: "+branchname2);
        System.out.println("Branch code: "+branchcode2);
        System.out.println("IFSC: "+IFSC2);
        System.out.println("Location: "+location2);
        System.out.println("Special Offers: "+offer2);
        System.out.println();
        System.out.println();
    }

    static void total()
    {
        System.out.println();
        System.out.println();
        System.out.println("_________________________________overall bank details______________________");
        System.out.println("total Bank Account Created: "+totalaccounts);
        System.out.println("total Amount in the over all Bank: "+totalbankbalance);
    }

    public static void main(String args[])
    {
        orglevelbank b1=new orglevelbank("srini","13/03/2004",6374056261L,50000,"Ariyankuppam");
        orglevelbank b2=new orglevelbank("saran","08/11/2004",6374563451L,55000,"chennai");
        bankdata();
        
        b1.desposit(5000);
        b2.withdraw(5000);
        b1.transfer(b2,2000);

        b1.user();
        b2.user();

        total();
    }

  


}

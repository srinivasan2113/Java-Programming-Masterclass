class payment{
    void acceptpayment(double d)
    {
        System.out.println("payment accepted through cash: "+d);
    }
    void acceptpayment(String cardnumber,double amount)
    {
        System.out.println("payment accepted through card: "+cardnumber+", amount: "+amount);
    }
    void acceptpayment(String upi,double amount,int phno){
        System.out.println("payment accepted through upi: "+upi+", amount: "+amount+", phno: "+phno);
    }
    public static void main(String args[]){
        payment p = new payment();
        p.acceptpayment(300);
        System.out.println("---------------------");
        p.acceptpayment("srini",200);
        System.out.println("---------------------");
        p.acceptpayment("SBI2113",5000,6374056);
        System.out.println("---------------------");




        
    }
}
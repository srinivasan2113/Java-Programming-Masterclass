package Mixed_construtor_chaining.product_System;

public class main_product {
    public static void main(String args[])
    {
        electronics e1=new electronics("mobile","IQOO","1 years");
        e1.display_electronics();
        System.out.println("---------------");
        mobile m1=new mobile("mobile","IQOO","1 year","VIVO");
        m1.display_mobile();
    }
}

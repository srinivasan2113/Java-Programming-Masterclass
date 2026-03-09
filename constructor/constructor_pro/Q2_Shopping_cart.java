package constructor_pro;

public class Q2_Shopping_cart {
    String Item;
    int Quantity;
    int price_per_unit;
    int Discount;
    int total_price;


    Q2_Shopping_cart(String pro,int no,int ui)
    {
        Item=pro;
        Quantity=no;
        price_per_unit=ui;
    }
    void display()
    {
        Discount=Quantity*120;
        total_price=(Quantity*price_per_unit)-Discount;
        System.out.println("Item           :"+Item);
        System.out.println("Quantity       :"+Quantity);
        System.out.println("Price per unit :"+price_per_unit);
        System.out.println("Discount       :"+Discount);
        System.out.println("Total Price  :"+total_price);
        System.out.println();

    }
    public static void main(String args[])
    {
        Q2_Shopping_cart p1=new Q2_Shopping_cart("laptop",1,1200);
        p1.display();

        Q2_Shopping_cart p2=new Q2_Shopping_cart("laptop",2,1200);
        p2.display();
    }
}

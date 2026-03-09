public class Q7_product {
    String product;
    int cost;
    static int count=0;
    Q7_product(String item,int price )
    {
        product=item;
        cost=price;
        count++;
    }
    void display()
    {
        System.out.println("product: "+product);
        System.out.println("cost: "+cost);
        System.out.println();
    }

    public static void main(String args[])
    {
        Q7_product p1=new Q7_product("television",50000);
        p1.display();
        Q7_product p2=new Q7_product("laptop",40000);
        p2.display();
        Q7_product p3=new Q7_product("phone",30000);
        p3.display();

        System.out.println("product count: "+Q7_product.count);
    }
}

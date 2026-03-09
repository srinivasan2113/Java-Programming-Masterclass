package Mixed_construtor_chaining.product_System;

public class product {
    String productID;
    String name;
    product()
    {
        this("unknown","unknown");
    }
    product(String productID)
    {
        this(productID,"unknown");
    }
    product(String productID,String name)
    {
        this.productID=productID;
        this.name=name;
    }

    void display()
    {
        System.out.println("productId: "+productID);
        System.out.println("name: "+name);
    }
}

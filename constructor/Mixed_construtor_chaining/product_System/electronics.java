package Mixed_construtor_chaining.product_System;

public class electronics extends product {
    String warranty;
    electronics(String productID,String name,String warranty)
    {
        super(productID,name);
        this.warranty=warranty;

    }
    
    void display_electronics()
    {
        System.out.println("productId: "+productID);
        System.out.println("name: "+name);
        System.out.println("warranty: "+warranty);
    }
}

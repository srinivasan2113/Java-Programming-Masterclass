package Mixed_construtor_chaining.product_System;

public class mobile extends electronics {
    String brand;
    mobile(String productID,String name,String warranty,String brand)
    {
        super(productID,name,warranty);
        this.brand=brand;
    }

    void display_mobile()
    {
        System.out.println("productId: "+productID);
        System.out.println("name: "+name);
        System.out.println("warranty: "+warranty);
        System.out.println("brand: "+brand);
    }
}

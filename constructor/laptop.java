public class laptop {
    String brand;
    String model;
    double price;
    String ram;

    laptop()
    {
        this("unknown","unknown",0.0,"unknown");
    }
    laptop(String brand)
    {
        this(brand,"unknown",0.0,"unknown");
    }
    laptop(String brand,String model)
    {
        this(brand,model,0.0,"unknown");
    }
    laptop(String brand,String model,double price)
    {
        this(brand,model,price,"unknown");
    }
  
    laptop(String brand,String model,double price,String ram){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.ram=ram;
    } 
    void display()
    {
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("price: "+price);
        System.out.println("ram: "+ram);
         System.out.println("--------------------");

    }

    public static void main(String args[])
    {
        laptop l1=new laptop();
        laptop l2=new laptop("ASUS");
        laptop l3=new laptop("ASUS","f15");
        laptop l4=new laptop("ASUS","f16",75000);
        laptop l5=new laptop("ASUS","f16",75000,"16GB");


        l1.display();
        l2.display();
        l3.display();
        l4.display();
        l5.display();
    }

}

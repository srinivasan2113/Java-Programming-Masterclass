package company.upcasting_down_casting_part_2;

public class car extends vehicle {
    String brand;
    double price;
    String power;

    car(String vehicleno,String color,String pilotname,String brand,double price,String power)
    {
        super(vehicleno,color,pilotname);
        this.brand=brand;
        this.price=price;
        this.power=power;
    }
     void start()
    {
        System.out.println("Car brand: " + brand);
        System.out.println("Car power: " + power);
        System.out.println("Car price: " + price);
        System.out.println("Car is starting with push button 🔥");
    }

    void playmusic()
    {
        System.out.println("car is started to play music");
    }
    
}

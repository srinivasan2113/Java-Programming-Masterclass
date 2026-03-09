package vehicle_super;

public class car extends vehicle{
    String fueltype;
    car(String brand,int speed,String fueltype)
    {
        super(brand,speed);
        this.fueltype=fueltype;
    }
    void display_car()
    {
        System.out.println("brand: "+brand);
        System.out.println("speed: "+speed);
        System.out.println("fueltype: "+fueltype);

    }
    
}

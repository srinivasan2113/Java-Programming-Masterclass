package vehicle_super;

public class vehicle {
    String brand;
    int speed;

    vehicle(String brand,int speed)
    {
        this.brand=brand;
        this.speed=speed;
    }
    void display_vehicle()
    {
        System.out.println("brand: "+brand);
        System.out.println("speed: "+speed);

    }
}

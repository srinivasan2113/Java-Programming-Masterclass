public class vehicle {
    int speed;
    String color;
    vehicle(int speed ,String color)
    {
        this.speed=speed;
        this.color=color;
    }
    void displayvehicle()
    {
        System.out.println("speed is: "+speed);
        System.out.println("color is: "+color);

    }
}
class bike extends vehicle{
    String bikename;
    bike(int speed,String color,String bikename)
    {
        super(speed,color);
        this.bikename=bikename;
    }
    void displaybike()
    {
        System.out.println("speed is: "+speed);
          System.out.println("color is: "+color);
        System.out.println("speed is: "+bikename);
}
}
class mainvehicle{
    public static void main(String[] args) {
        bike b1=new bike(150,"red","enfield");
        b1.displaybike();
    }
}

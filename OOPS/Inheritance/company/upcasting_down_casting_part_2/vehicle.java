/*🔹 Question 1 – Basic Upcasting with Method Overriding

Create a class Vehicle with:

method start()

method stop()

Create a class Car that extends Vehicle:

Override start()

Add method playMusic()

In main():

Create a Car object.

Perform upcasting using Vehicle reference.

Call methods using the parent reference.

Try calling playMusic() using parent reference (observe behavior). */





package company.upcasting_down_casting_part_2;

public class vehicle {

    String vehicleno;
    String color;
    String pilotname;

    vehicle(String vehicleno)
    {
        this(vehicleno,"unknown","unknown");
    }

    vehicle(String vehicleno,String color)
    {
        this(vehicleno,color,"unknown");
    }
    vehicle(String vehicleno,String color,String pilotname)
    {
        this.vehicleno=vehicleno;
        this.color=color;
        this.pilotname=pilotname;
    }

    void start()
    {
        System.out.println("started vehiceno is: "+vehicleno );
        System.out.println("Started vechicle color is: "+color);
        System.out.println("Started vechicle pilot name is: "+pilotname);
    }
    void stop()
    {
        System.out.println("stoped vehiceno is: "+vehicleno );
        System.out.println("Stoped vechicle color is: "+color);
        System.out.println("Stopted vechicle pilot name is: "+pilotname);
    }

    
    
    
}

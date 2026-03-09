package company.upcasting_down_casting_part_2;

public class main_vehicle {
    public static void main(String args[])
    {
        car c1=new car("PY2113","red","srini","BMW",1000000,"1000hp");
        c1.start();
        c1.playmusic();
        c1.stop();
        System.out.println("-----------------");

        vehicle v1=c1;
        v1.start();
        v1.stop();
        System.out.println("-----------------");

        car c2=(car)v1;
        c2.start();
        c2.playmusic();
        c2.stop();
        System.out.println("-----------------");
    }
}

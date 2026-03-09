public class ABC {
    static int a=20;
    static{
        System.out.println("i am mlsi form class ABC");
    }
    public static void main(String args[])
    {
        System.out.println("main method start");
        System.out.println(xyz.l);
        System.out.println(a);
        System.out.println("main method ends");
    }
    static{
        System.out.println(a);
        a=10;
    }
}

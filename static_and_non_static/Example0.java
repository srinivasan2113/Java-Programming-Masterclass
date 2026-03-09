public class Example0 {
    static int a=test();
    static int b=20;
    static{
        System.out.println(a);
        System.out.println(b);
        b=40;

    }
    public static void main(String[] args)
    {
        System.out.println("main starts");
        System.out.println(a);
        System.out.println(b);
        test();

    }
    public static int test()
    {
        System.out.println("from test() method");
        return 30;
    }

    
}

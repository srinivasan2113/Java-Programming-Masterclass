package OOPS.Abstraction;
import java.util.Arrays;
public class varArgs {
    public static void m1(int b, int c, int  ...a)
    {
        System.out.println("b is: "+b);
        System.out.println("c is: "+c);
        System.out.println("a is: "+Arrays.toString(a));
    }

    public static void main(String[] args)
    {
        System.out.println("variable argument");
        m1(10,20,30,40,50,60,80,50);
    }
}

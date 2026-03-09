package OOPS.Abstraction;
abstract class Restaurant
{
    abstract void biriyani();

}

class A2B extends Restaurant
{
    void biriyani()
    {
        System.out.println("this is biriyani");
    }
} 
public class Example1 {
    public static void main(String args[] )
    {
        Restaurant r1=new A2B();

        A2B a1=new A2B();
        a1.biriyani();
        r1.biriyani();
    }
}

public class recursion1
{
    public static void display(int n)
    {
        if(n==0)
        {
            return;
        }
        display(n-1);
        System.out.println(n);
    }
    public static void main(String args[])
    {
        System.out.println("main start");
        display(5);
        System.out.println("main ends");
    }
}
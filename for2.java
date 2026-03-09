import java.util.Scanner;
class factors
{
static Scanner sc = new Scanner(System.in);
public static void main(String args[])
{
    System.out.print("enter the value to div:");
    int num=sc.nextInt();
    System.out.println("enter the value is:"+num);

    for (int i=1; i<=num; i++)
    {
        if(num%i==0)
        {
            System.out.println(i);
        }
    }
}
}
//factorial of number
import java.util.Scanner;
class factor
{
static Scanner sc = new Scanner(System.in);
public static void main(String args[])
{
    System.out.print("Eneter the value for factor:");
    int a=sc.nextInt();
    System.out.println("the enterd number is :"+a);
    int ans=1;
     for (int i=1; i <= a; i++)
     {
        ans=ans*i;
    
     }
     System.out.println("Enter the value:"+ans);
}

}
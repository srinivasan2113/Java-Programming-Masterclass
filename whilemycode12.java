//Find the GCD of two numbers using repeated subtraction (while loop).
import java.util.Scanner;
class ownGCD
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("enter your first value:");
        int a = sc.nextInt();
        System.out.print("enter your second value:");
        int b = sc.nextInt();
        int rogA=a;
        int rogB=b;
        int bigvalue=0;

        int start=1;
        

        while (start<=a  &&  start<=b)
        {
            if(a%start==0 && b%start==0)
            {
                System.out.println("divisiable of "+a+" and "+b+" is: "+start);

                bigvalue = start;
                
            }
            

            start++;
        }
        System.out.println("the GCD of "+rogA+ " and "+rogB+" is : "+ bigvalue);

        

    }
}
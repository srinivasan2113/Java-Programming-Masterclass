//🔟 Find factorial of a number using while.

import java.util.Scanner;
class factorial{
    static Scanner sc=new Scanner (System.in);
    public static void main(String args[])
    {
        System.out.print("enter your value to find the factorial:");
        int fact=sc.nextInt();
        System.out.println("your enterd value is :"+fact);


        int mult=1;


        while(fact>0)
        {
            mult=mult*fact;
            fact--;
        }
        System.out.println(mult);


    }
}
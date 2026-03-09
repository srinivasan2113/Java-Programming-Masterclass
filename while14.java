// find the greatest digit

import java.util.Scanner;
class bigg
{
    static Scanner sc=new Scanner (System.in);
    public static void main (String args [])
    {
        System.out.print("enter your value:");
        long num = sc.nextLong();

        System.out.println("your enterd value is: "+num);


        long total= Math.abs(num);
        long maxvalue=0;



        
        while(total>0)
        {
            long lastdigit = total%10;

            if(lastdigit>maxvalue)
            {
                maxvalue=lastdigit;
            }
            total=total/10;
        }

        System.out.println("the maxdigit is: "+maxvalue);
    }
}
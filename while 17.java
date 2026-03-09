// adding first and last digit
//EXAMPLE: 12345-->1+5=6


import java.util.Scanner;
class firstlast
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String args [])
    {
        System.out.println("enter your value");
        int a = sc.nextInt();
        int first=a;
        int last = a%10;
        System.out.println("last:"+last);
        while (first>9)
            {
                 first=first/10;
                 System.out.println("first:"+first);    
            }
            System.out.println("first"+first);

            System.out.println("sum of last + first is : "+(first+last));
        
    }
}
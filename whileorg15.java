//Armstrong number example : 153


import java.util.Scanner;
class armstrongorg
{
    static Scanner sc = new Scanner (System.in);
    public static void main (String args [])
    {

        System.out.print("Enter your value for Armstrong:");
        int a = sc.nextInt();

        int A1 = Math.abs(a);
        int A2 = Math.abs(a);
        int count = 0;
        int sum = 0;


        while(A1>0)
        {
            count++;
            A1=A1/10;
            
        }
        

        while(A2>0)
            {
                int c = count;
                int power = 1;
                int last = A2%10;
                

                while(c>0)
                {
                    power = power*last;
                    c--;
                    

                }
                sum=sum+power;
                A2=A2/10;
                }
                
                
                if (a==sum)
                {
                    System.out.println("it was Armstrong:"+sum);
                }
                else
                {
                    System.out.println("it was not Armstrong:"+sum);
                }






    }
}
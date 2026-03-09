//Armstrong


import java.util.Scanner;
class Armstrong
{
    static Scanner sc =  new Scanner (System.in);
    public static void main (String args[])
    {
        System.out.print("enter your value:");
        int a = sc.nextInt();
        
        int arm = Math.abs(a);
        int srm = Math.abs(a);
        
        int count=0;
        while (arm>0)
        {
            
            count++;
            arm=arm/10;

        }
        System.out.println(count);
        System.out.println(arm);
        int sum=0;


        while (srm > 0)
        {
            int l = srm%10;
            int ans =1;
            int c=count;
            while (c>0)
            {
                ans=ans*l;
                c--;
                System.out.println(ans);
            

            }
            sum=sum+ans;
            
            srm=srm/10;

        }
        System.out.println(sum);

        if(sum==a)
        {
            System.out.println("it is Armstrong="+sum);
        }
        else
        {
            System.out.println("it is not Armstrong="+sum);
        }
        
        
      
    }
}
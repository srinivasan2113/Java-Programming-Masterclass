import java.util.Scanner;

public class Q16_Missing_number {
    static Scanner sc=new Scanner(System.in);
    public static void sec_max(int[] a,int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        int total=0;
        int formula=(max*(max+1))/2;
        System.out.println("the formula used value is:"+formula);
        for(int i=0;i<n;i++)
        {
            total=total+a[i];
        }
        int miss=formula-total;
        System.out.println("the total value is: "+total);
        if(miss==0)
        {
            System.out.println("there is no missing value");
        }
        else
        {
            System.out.println("the missing value is :"+miss);
        }


    }
    public static void main(String args[])
    {
        System.out.print("enter the lenght of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values for the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

    sec_max(a,n);
        
    }

}

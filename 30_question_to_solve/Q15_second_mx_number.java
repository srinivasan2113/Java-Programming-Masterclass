import java.util.Scanner;

public class Q15_second_mx_number {
    static Scanner sc=new Scanner(System.in);
    public static void sec_max(int[] a,int n)
    {
        
        int second_big=Integer.MIN_VALUE;
        int big=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
        
        if(a[i]>big)
        {
            big=a[i]; 
            
        }
     
       }
       for(int j=0;j<n;j++)
       {
           if(a[j]>second_big && a[j]!=big)
        {
            second_big=a[j];
        }
        
       }
       System.out.println("big: "+big);
       System.out.println("second_big: "+second_big);
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

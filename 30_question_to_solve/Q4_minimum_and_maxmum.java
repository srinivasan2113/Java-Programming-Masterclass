import java.util.*;
public class Q4_minimum_and_maxmum {
    static Scanner sc=new Scanner(System.in);
    public static void min(int[] a,int n)
    {
        int min=a[0];
        int max=a[0];
        for(int j=0;j<n;j++)
        {
            if(a[j]<min)
            {
                min=a[j];
            }
            if(a[j]>max)
            {
                max=a[j];
            }

        }
            
            System.out.println("the min value is: "+min);
            System.out.println("the max value is: "+max);
    }
    public static void main(String args[])
    {
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        min(a,n);
        
    }
}

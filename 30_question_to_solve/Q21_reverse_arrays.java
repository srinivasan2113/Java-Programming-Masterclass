import java.util.*;
public class Q21_reverse_arrays
{
    static Scanner sc=new Scanner(System.in);
    public static void rev(int[] a,int n)
    {
        int temp=0;
        for(int i=0;i<n/2;i++)
        {
            temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;


        }

    }
    public static void main(String args[])
    {
        System.out.print("enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the value for the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        rev(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
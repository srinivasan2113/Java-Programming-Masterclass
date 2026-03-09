import java.util.*;
public class Q25_pairs {
    static Scanner sc=new Scanner(System.in);
    public static void pairs(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                System.out.print("("+a[i]+","+a[j]+")");
            }
        }

    }
    public static void main(String args[])
    {
        System.out.print("enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the value for the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        pairs(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}

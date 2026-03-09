import java.util.*;
public class Q6_all_the_even_changed_to_minus_one {
    static Scanner sc=new Scanner(System.in);
    public static void one(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                a[i]=-1;
                
            }
        }
    }
    public static void main(String args[])
    {
        System.out.print("Enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the values of the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        one(a,n);
        System.out.println("-1 array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


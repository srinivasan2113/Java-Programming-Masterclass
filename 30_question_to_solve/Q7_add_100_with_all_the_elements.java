import java.util.*;
public class Q7_add_100_with_all_the_elements {
     static Scanner sc=new Scanner(System.in);
    public static void one(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            a[i]=a[i]+100;
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
        System.out.println("plus 100");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
}

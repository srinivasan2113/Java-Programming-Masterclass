import java.util.*;
public class Q5_reverse {
    static Scanner sc=new Scanner(System.in);
    public static void rev(int[] a,int n)
    {
        int temp=0;
        for(int i=0;i<n/2;i++)
        {
            temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
    }
    public static void main (String args[])
    {
        System.out.print("Enter the length of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the values of array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        rev(a,n);
         System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

import java.util.*;
public class Q18_swap_alternatives_in_array {
    static Scanner sc=new Scanner(System.in);
    public static void alternatives(int[] a, int n)
    {
        int temp=0;

        for(int i=0;i<n-1;i+=2)
        {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            
        }
                                                                                                                          
    }
    public static void main(String args[])
    {
        System.out.print("enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the values in array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        alternatives(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}

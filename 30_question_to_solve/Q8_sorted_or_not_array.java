import java.util.*;
public class Q8_sorted_or_not_array {
    static Scanner sc=new Scanner(System.in);
    public static void sor(int[] a,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                System.out.println("not sorted");
                return;
            }
            else{
                System.out.println("sorted");
            }
        }
    }
    public static void main(String args[])
    {
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the value of the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sor(a,n);
    }
}

import java.util.*;
public class Q2_mult_all_the_elements_in_array {
    static Scanner sc=new Scanner(System.in);
    public static int mult(int[] a,int n)
    {
        int mults=1;
        for(int j=0;j<n;j++)
        {
            mults=mults*a[j];
        }
        return mults;
    }
    public static void main(String args[])
    {
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values in array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int answer=mult(a,n);
        System.out.print("the multiplication of the array is: "+answer);
    }
}

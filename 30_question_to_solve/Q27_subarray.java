
import java.util.Scanner;
public  class Q27_subarray{
static Scanner sc=new Scanner(System.in);
public static void subarray(int[] a,int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            for(int k=i;k<=j;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println();
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
        subarray(a,n);
        
    }

}
import java.util.Scanner;
public class Q28_subarray_sum {
    static Scanner sc=new Scanner(System.in);
    public static void subarray_sum(int[] a,int n)
    {
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+a[k];
                }
                System.out.println("the sum is: "+sum);
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
        subarray_sum(a,n);
    }

    
}

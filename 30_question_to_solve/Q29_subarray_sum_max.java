import java.util.Scanner;
public class Q29_subarray_sum_max {
    static Scanner sc=new Scanner(System.in);
    public static void max_subarray(int[] a,int n)
    {
        int max=a[0];
        for(int i=0;i<n;i++)
        {
           for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+a[k];
                }
                if(sum>max) 
                {
                    max=sum;
                }

                
            } 
        }
        System.out.println("the max value is : "+ max);
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
        max_subarray(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    
}

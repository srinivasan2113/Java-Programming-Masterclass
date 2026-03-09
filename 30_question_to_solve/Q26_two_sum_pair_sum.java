import java.util.Scanner;
public class Q26_two_sum_pair_sum {
    static Scanner sc=new Scanner(System.in);
    public static void two_sum(int[] a,int n,int k)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=a[i]+a[j];
                if(sum==k)
                {
                    System.out.println("the match of key is "+a[i]+"+"+a[j]+"="+sum);
                }
            }
        }

    }
    public static void main(String args[])
    {
        System.out.print("enter the length of the array");
        int n=sc.nextInt();
        System.out.print("enter the key value");
        int k=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the value for the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        two_sum(a,n,k);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

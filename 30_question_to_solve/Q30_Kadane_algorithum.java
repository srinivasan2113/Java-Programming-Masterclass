import java.util.Scanner;
public class Q30_Kadane_algorithum {
    static Scanner sc=new Scanner(System.in);
    public static void kadane(int[] a,int n)
    {
        int currentsum=a[0];
        int maxsum=a[0];
        for(int i=0;i<n;i++)
        {
            currentsum=Math.max(a[i],currentsum+a[i]);
            maxsum=Math.max(maxsum,currentsum);
        }
        System.out.println("the currentsum is:"+currentsum);
        System.out.println("the maxsum is: "+maxsum);
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
        kadane(a,n);
    }
    
}

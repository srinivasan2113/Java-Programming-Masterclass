import java.util.*;
public class Q23_move_zero_at_end {
    static Scanner sc=new Scanner(System.in);
    public static void zero(int[] a,int n)
    {
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<n-1;i++)
                {
                    if(a[i]==0)
                        {
                            int temp=a[i];
                            a[i]=a[i+1];
                            a[i+1]=temp;
                        }
                    }
                }
    } 
    public static void main(String args[])
    {
        System.out.println("enter the length of the array:");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the value for the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        zero(a,n);

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

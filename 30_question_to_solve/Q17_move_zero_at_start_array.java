import java.util.*;
public class Q17_move_zero_at_start_array {
    static Scanner sc=new Scanner(System.in);
    public static void zero(int[] a,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                count++;
            }

        }
        for(int i=0;i<n-count;i++)
        {
            a[i]=0;
        }
        for(int i=n-count;i<n;i++)
        {
            a[i]=1;
        }

    }
    public static void main(String args[])
    {
        System.out.print("enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the values of array only 0s and 1s:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        zero(a,n);
        System.out.println("zero at the start");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    
}

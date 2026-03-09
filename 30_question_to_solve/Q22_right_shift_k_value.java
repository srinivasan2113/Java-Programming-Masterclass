import java.util.*;
public class Q22_right_shift_k_value {
    static Scanner sc=new Scanner(System.in);
    public static void shift(int[] a,int n,int k)
    {
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==k)
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                break;
            }
        }
    }
    public static void main(String args[])
    {
        System.out.print("enter the length of the array");
        int n=sc.nextInt();
        System.out.print("enter the k value");
        int k=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the value for array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        shift(a,n,k);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}

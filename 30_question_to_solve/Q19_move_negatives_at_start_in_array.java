import java.util.*;
public class Q19_move_negatives_at_start_in_array {
    static Scanner sc=new Scanner(System.in);
    public static void negative(int[] a,int n)
    {
        int temp=0;
        for(int j=0;j<n;j++)
        {
        for(int i=1;i<n;i++)
        {
            if(a[i]<0)
            {
                temp=a[i];
                a[i]=a[i-1];
                a[i-1]=temp;

            }
        }
    }
    }
    public static void main(String args[])
    {
        System.out.print("enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println(" enter the values for array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        negative(a,n);

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}

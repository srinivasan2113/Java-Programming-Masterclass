import java.util.Scanner;

public class Q13_left_rotate_by_one_position {
    static Scanner sc=new Scanner(System.in);
    public static void rotate(int[] a,int n)
    {
        int k=5;
        
        for(int j=0;j<k-1;j++)
        {
            int start=a[0];
        for(int i=0;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        a[n-1]=start;
    }
       
    }
    public static void main(String args[])
    {
        System.out.print("enter the lenght of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values for the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        rotate(a,n);
        System.out.println("left rotated array");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

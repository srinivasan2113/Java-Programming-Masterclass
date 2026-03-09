import java.util.Scanner;

public class Q14_right_rotate_by_position {
static Scanner sc=new Scanner(System.in);
    public static void rotate(int[] a,int n)
    {
        int k=4;
        k=k%n;
        
        for(int j=0;j<k;j++)
        {
            int end=a[n-1];
        for(int i=n-1;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=end;
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

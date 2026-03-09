import java.util.*;
public class one_step_back_array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter the length of the arraysss:");
        int n=sc.nextInt();
        int b[]=new int[n];
        System.out.print("enter the arrays till "+n+":");
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }

        int temp=b[n-1];

        for(int i=n-1;i>0;i--)
        {
            b[i]=b[i-1];
        }
        b[0]=temp;

        System.out.print("the right rotated value is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]);
            System.out.print(" ");
        }
    }
    
}

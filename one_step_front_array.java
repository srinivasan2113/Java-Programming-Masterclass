import java.util.*;
public class one_step_front_array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("enterr the length of array:");
        int n=sc.nextInt();
        int b[]=new int[n];
        System.out.println("enter the arrays till "+n+":");
        
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int temp=b[0];
        for(int i=0;i<n-1;i++)
        {
            b[i]=b[i+1];

        }
        b[n-1]=temp;

        System.out.print("The reversed values are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]);
            System.out.print(" ");
        }

    }

}

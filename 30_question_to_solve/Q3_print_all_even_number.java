import java.util.*;
public class Q3_print_all_even_number {
    static Scanner sc=new Scanner(System.in);
    public static void even(int[] a,int n)
    {
     
        for(int j=0;j<n;j++)
        {
            if(a[j]%2==0)
            {
                System.out.println(a[j]);

                
            }

        }

        }
    public static void main(String args[])
    {
        System.out.print("enter the length of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the values of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("the even numbers are:");
       even(a,n);
       
    }
    
}

import java.util.*;
public class Q24_single_number_array {
    static Scanner sc=new Scanner(System.in);
    public static void single(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            int count =0;
            for(int j=0;j<n;j++)
            {

                if(a[i]==a[j])
                {
                    count++;
                    
                }
            }
            if(count==1)
            {
                System.out.println("the single number is: "+a[i]);
            }
        }
    }
    public static void main(String args[])
    {
        System.out.print("enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter the value for array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        single(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
